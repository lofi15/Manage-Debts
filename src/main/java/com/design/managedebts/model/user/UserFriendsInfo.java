package com.design.managedebts.model.user;

import javax.persistence.Id;

public class UserFriendsInfo {

    // index on userId
    @Id
    long id;

    // here comibation of userId and friendId is not unique if entries are stored two times.

    long userId;

    long friendId;

    public UserFriendsInfo(long userId, long friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }

    public UserFriendsInfo() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getFriendId() {
        return friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }
}
