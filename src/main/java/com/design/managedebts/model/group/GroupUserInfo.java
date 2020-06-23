package com.design.managedebts.model.group;

public class GroupUserInfo {

    long group_id;

    long user_id;

    public GroupUserInfo() {
    }

    public GroupUserInfo(long group_id, long user_id) {
        this.group_id = group_id;
        this.user_id = user_id;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "GroupUserInfo{" +
                "group_id=" + group_id +
                ", user_id=" + user_id +
                '}';
    }
}
