package com.design.managedebts.service;

import com.design.managedebts.enums.ExpenseType;
import com.design.managedebts.model.expense.ExpenseDetails;
import com.design.managedebts.repository.ExpenseRepository;
import com.design.managedebts.request.CreateExpenseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {


    @Autowired
    ExpenseRepository expenseRepository;

    public void createExpense(CreateExpenseRequest expenseRequest ){

        ExpenseDetails currentExpenseDetails = new ExpenseDetails(
                expenseRequest.getExpenseType(),
                expenseRequest.getSplitType(),
                expenseRequest.getCreatedBy(),
                expenseRequest.getPaidBy(),
                expenseRequest.getNote(),
                expenseRequest.getTotalAmount());

        if(currentExpenseDetails.getType().equals(ExpenseType.GROUP)){

        }



        //expenseRepository.save(currentExpenseDetails);






    }



}
