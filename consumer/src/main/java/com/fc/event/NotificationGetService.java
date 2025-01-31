package com.fc.event;

import com.fc.Notification;
import com.fc.NotificationRepository;
import com.fc.NotificationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class NotificationGetService {

    @Autowired
    private NotificationRepository repository;

    public Optional<Notification> getNotificationByTypeAndCommentId(NotificationType type, long commentId) {
        return repository.findByTypeAndCommentId(type, commentId);
    }


    public Optional<Notification> getNotificationByTypeAndPostId(NotificationType type, long postId) {
        return repository.findByTypeAndCommentId(type, postId);
    }

}
