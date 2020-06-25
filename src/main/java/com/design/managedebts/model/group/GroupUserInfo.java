package com.design.managedebts.model.group;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "group_user_info")
@IdClass(GroupUserInfoId.class)
public class GroupUserInfo {

    // TODO : make composite key from userId and groupId , remove autogenerated-> waste of space.

    // index on this too
    @Id
    private long userId;

    @Id
    private long groupId; // serach has to be usually done by group id also, need of index

    public GroupUserInfo() {
    }

    public GroupUserInfo(long userId, long groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "GroupUserInfo{" +
                ", userId=" + userId +
                ", groupId=" + groupId +
                '}';
    }

}
