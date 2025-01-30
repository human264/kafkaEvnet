package com.fc.event;


import lombok.Data;

import java.time.Instant;

@Data
public class FollowEvent {
    private FollowEventType type;
    private long userId;
    private long targetUserId;
    private Instant createdAt;

    public FollowEvent() {
    }

    public FollowEventType getType() {
        return this.type;
    }

    public long getUserId() {
        return this.userId;
    }

    public long getTargetUserId() {
        return this.targetUserId;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setType(final FollowEventType type) {
        this.type = type;
    }

    public void setUserId(final long userId) {
        this.userId = userId;
    }

    public void setTargetUserId(final long targetUserId) {
        this.targetUserId = targetUserId;
    }

    public void setCreatedAt(final Instant createdAt) {
        this.createdAt = createdAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof FollowEvent)) {
            return false;
        } else {
            FollowEvent other = (FollowEvent)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getUserId() != other.getUserId()) {
                return false;
            } else if (this.getTargetUserId() != other.getTargetUserId()) {
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
        return other instanceof FollowEvent;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        long $userId = this.getUserId();
        result = result * 59 + (int)($userId >>> 32 ^ $userId);
        long $targetUserId = this.getTargetUserId();
        result = result * 59 + (int)($targetUserId >>> 32 ^ $targetUserId);
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = String.valueOf(this.getType());
        return "FollowEvent(type=" + var10000 + ", userId=" + this.getUserId() + ", targetUserId=" + this.getTargetUserId() + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ")";
    }
}
