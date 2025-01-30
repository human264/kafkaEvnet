package com.fc.task;

import com.fc.*;
import com.fc.event.CommentEvent;
import com.fc.event.NotificationGetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Component
public class CommentRemoveTask {

    @Autowired
    PostClient postClient;

    @Autowired
    NotificationGetService getService;

    @Autowired
    NotificationRemoveService removeService;

    public void processEvent(CommentEvent evnet) {
        Post post = postClient.getPost(evnet.getPostId());
        if (Objects.equals(post.getUserId(), evnet.getUserId())) {
            return;
        }

        getService.getNotification(NotificationType.COMMENT, evnet.getCommentId())
                .ifPresentOrElse(
                        notification -> removeService.deletedById(notification.getId()),
                        () -> log.error("Notificaiton Not found")
                );


    }


}
