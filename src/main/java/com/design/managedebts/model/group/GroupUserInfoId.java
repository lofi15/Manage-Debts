package com.design.managedebts.model.group;

import java.io.Serializable;
import java.util.Objects;

public class GroupUserInfoId implements Serializable {

    private long userId;

    private long groupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupUserInfoId)) return false;
        GroupUserInfoId that = (GroupUserInfoId) o;
        return userId == that.userId &&
                groupId == that.groupId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, groupId);
    }
}
