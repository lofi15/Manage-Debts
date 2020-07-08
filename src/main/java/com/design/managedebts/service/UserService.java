package com.design.managedebts.service;

import com.design.managedebts.model.user.UserFriendsInfo;
import com.design.managedebts.repository.UserFriendsInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserFriendsInfoRepository userFriendsInfoRepository;

    public void addFriend(Long userId, Long friendId){

        List<UserFriendsInfo> userFriendsInfoList = new ArrayList<>();
        userFriendsInfoList.add(new UserFriendsInfo(userId,friendId));
        userFriendsInfoList.add(new UserFriendsInfo(friendId,userId));
        userFriendsInfoRepository.saveAll(userFriendsInfoList);
    }



}
