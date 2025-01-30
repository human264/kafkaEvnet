package com.fc.task;


import com.fc.*;
import com.fc.event.CommentEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class CommentAddTask {

    private final PostClient postClient;
    private final CommentClient commentClient;
    private final NotificationSaveService saveService;

    public void processEvent(CommentEvent event) {
        // 내가 작성한 댓글인 경우 무시
        Post post = postClient.getPost(event.getPostId());

        if(Objects.equals(post.getUserId(), event.getUserId())) {
            return;
        }

        Comment comment = commentClient.getComment(event.getCommentId());
        // 알림생성
        Notification notification = createNotification(post, comment);
        // 저장
        saveService.insert(notification);
    }

    private Notification createNotification(Post post, Comment comment) {
        Instant now = Instant.now();

        return new CommentNotification(
                NotificationIdGenerator.generate(),
                post.getUserId(),
                NotificationType.COMMENT,
                comment.getCreatedAt(),
                now,
                now,
                now.plus(90, ChronoUnit.DAYS),
                post.getId(),
                comment.getUserId(),
                comment.getContent(),
                1L
        );
    }
}
