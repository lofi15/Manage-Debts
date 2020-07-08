package com.design.managedebts.model.user;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_friends_info")
public class UserFriendsInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long userId;

    private long friendId;

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

    @Override
    public String toString() {
        return "UserFriendsInfo{" +
                "userId=" + userId +
                ", friendId=" + friendId +
                '}';
    }
}
