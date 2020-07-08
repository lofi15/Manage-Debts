package com.design.managedebts.service;

import com.design.managedebts.enums.ExpenseType;
import com.design.managedebts.model.expense.ExpenseDetails;
import com.design.managedebts.model.group.GroupExpenseInfo;
import com.design.managedebts.repository.ExpenseRepository;
import com.design.managedebts.request.CreateExpenseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {


    @Autowired
    ExpenseRepository expenseRepository;

    @Autowired
    GroupService groupSerivce;

    @Autowired
    BalanceService balanceService;

    public void createExpense(CreateExpenseRequest expenseRequest ){

        ExpenseDetails currentExpenseDetails = new ExpenseDetails(
                expenseRequest.getExpenseType(),
                expenseRequest.getSplitType(),
                expenseRequest.getCreatedBy(),
                expenseRequest.getPaidBy(),
                expenseRequest.getNote(),
                expenseRequest.getTotalAmount());



        if(currentExpenseDetails.getType().equals(ExpenseType.GROUP)){
            // save in group ExpenseInfo
            groupSerivce.saveGroupExpense(expenseRequest.getGroupId(),currentExpenseDetails.getId());
        }

        // call balance service to create debts
        balanceService.createDebtRecords(expenseRequest,currentExpenseDetails.getId());


        //save expense details, expenseRepository.save(currentExpenseDetails);
        expenseRepository.save(currentExpenseDetails);





    }



}
