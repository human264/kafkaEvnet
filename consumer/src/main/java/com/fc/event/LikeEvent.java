package com.fc.event;


import lombok.Data;

import java.time.Instant;

@Data
public class LikeEvent {
    private LikeEventType type;
    private long postId;
    private long userId;
    private Instant createdAt;

    public LikeEvent() {
    }

    public LikeEventType getType() {
        return this.type;
    }

    public long getPostId() {
        return this.postId;
    }

    public long getUserId() {
        return this.userId;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setType(final LikeEventType type) {
        this.type = type;
    }

    public void setPostId(final long postId) {
        this.postId = postId;
    }

    public void setUserId(final long userId) {
        this.userId = userId;
    }

    public void setCreatedAt(final Instant createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof LikeEvent)) {
            return false;
        } else {
            LikeEvent other = (LikeEvent)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getPostId() != other.getPostId()) {
                return false;
            } else if (this.getUserId() != other.getUserId()) {
                return false;
            } else {
                Object this$type = this.getType();
                Object other$type = other.getType();
                if (this$type == null) {
                    if (other$type != null) {
                        return false;
                    }
                } else if (!this$type.equals(other$type)) {
                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt != null) {
                        return false;
                    }
                } else if (!this$createdAt.equals(other$createdAt)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LikeEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $postId = this.getPostId();
        result = result * 59 + (int)($postId >>> 32 ^ $postId);
        long $userId = this.getUserId();
        result = result * 59 + (int)($userId >>> 32 ^ $userId);
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = String.valueOf(this.getType());
        return "LikeEvent(type=" + var10000 + ", postId=" + this.getPostId() + ", userId=" + this.getUserId() + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ")";
    }
}
