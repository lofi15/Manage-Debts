package com.design.managedebts.service;

import com.design.managedebts.model.group.GroupExpenseInfo;
import com.design.managedebts.repository.GroupExpenseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    GroupExpenseInfoRepository groupExpenseInfoRepository;

    public void saveGroupExpense(Long groupId, Long expenseId){
        GroupExpenseInfo groupExpenseInfo = new GroupExpenseInfo(groupId,expenseId);
        groupExpenseInfoRepository.save(groupExpenseInfo);
    }

}
