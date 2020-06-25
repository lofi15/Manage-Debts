package com.design.managedebts.service;

import com.design.managedebts.model.group.GroupDetails;
import com.design.managedebts.model.group.GroupExpenseInfo;
import com.design.managedebts.model.group.GroupUserInfo;
import com.design.managedebts.repository.GroupDetailsRepository;
import com.design.managedebts.repository.GroupExpenseInfoRepository;
import com.design.managedebts.repository.GroupUserInfoRepository;
import com.design.managedebts.request.CreateGroupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {

    @Autowired
    private GroupExpenseInfoRepository groupExpenseInfoRepository;

    @Autowired
    private GroupDetailsRepository groupDetailsRepository;

    @Autowired
    private GroupUserInfoRepository groupUserInfoRepository;

    public void saveGroupExpense(Long groupId, Long expenseId){
        GroupExpenseInfo groupExpenseInfo = new GroupExpenseInfo(groupId,expenseId);
        groupExpenseInfoRepository.save(groupExpenseInfo);
    }

    public void createGroup(CreateGroupRequest request){

        GroupDetails currentGroup = new GroupDetails(request.getName(),request.getCreatedBy());
        List<GroupUserInfo> groupUserInfoList = new ArrayList<GroupUserInfo>();

        request.getMembers().stream().forEach( memberId ->{
                        groupUserInfoList.add(
                                new GroupUserInfo(memberId,currentGroup.getId()));
                }
        );
        groupUserInfoList.add(new GroupUserInfo(request.getCreatedBy(),currentGroup.getId()));

        groupUserInfoRepository.saveAll(groupUserInfoList);
        groupDetailsRepository.save(currentGroup);
        // return success !

    }


}
