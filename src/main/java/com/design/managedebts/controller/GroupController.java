package com.design.managedebts.controller;

import com.design.managedebts.request.CreateGroupRequest;
import com.design.managedebts.response.Response;
import com.design.managedebts.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {

    // add group
    // edit group -> (add more members, remove some ,remove can only be done by creator )
    // any one added to groups automatically added to friends

    @Autowired
    GroupService groupService;

    @PostMapping("/create")
    public Response<String> createGroup(@RequestBody CreateGroupRequest request){
        groupService.createGroup(request);
        return new Response<>(HttpStatus.OK,new String(""));
    }









}
