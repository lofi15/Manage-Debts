package com.design.managedebts.controller;

import com.design.managedebts.response.Response;
import com.design.managedebts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users/")
public class UserController {

    @Autowired
    UserService userService;
    // add friends
    // remove friends
    // add user

    @PostMapping("/friend/add")
    public Response<String> addFriend(@RequestParam("friend_id") String friendId,
                                      @RequestParam("user_id") String userId){

        return null;
    }



}
