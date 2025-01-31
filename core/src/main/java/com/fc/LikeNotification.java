package com.fc;

import lombok.Getter;
import org.springframework.data.annotation.TypeAlias;

import java.time.Instant;
import java.util.List;

@Getter
@TypeAlias("LikeNotification")
public class LikeNotification extends Notification {

    private final Long postId;
    private final List<Long> likerIds;

    public LikeNotification(String id, Long userId, NotificationType type, Instant occuredAt, Instant createdAt, Instant lastUpdatedAt, Instant deletedAt, Long postId, List<Long> likerIds) {
        super(id, userId, type, occuredAt, createdAt, lastUpdatedAt, deletedAt);
        this.postId = postId;
        this.likerIds = likerIds;
    }

    public void addLiker(Long likerId, Instant occuredAt, Instant now, Instant retention) {
        this.likerIds.add(likerId);
        this.setOccuredAt(occuredAt);
        this.setLastUpdatedAt(now);
        this.setDeletedAt(retention);
    }

}
