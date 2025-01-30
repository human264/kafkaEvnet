package com.fc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@AllArgsConstructor
@Document("notifications")
public abstract class Notification {
    public String id;
    public Long userId;
    public NotificationType type;
    public Instant occuredAt;
    public Instant createdAt;
    public Instant lastUpdatedAt;
    public Instant deletedAt;

    public Notification(String id, Long userId, NotificationType type, Instant createdAt, Instant deletedAt) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }
}
