package com.design.managedebts.controller;

import com.design.managedebts.request.CreateExpenseRequest;
import com.design.managedebts.response.ExpenseCreationResponse;
import com.design.managedebts.response.Response;
import com.design.managedebts.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create/expense/")
public class ExpenseController {

    // create expense -> 1. of either group or individual(with friends)
    //                   2. can be divided equally or unequally (percentage or custom)

    // delete expense

    // edit expense
            // 1. change totalAmount
            //2. add users to expense
            // 3. remove users from expense

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/equal")
    public Response<ExpenseCreationResponse> createExpense(@RequestBody CreateExpenseRequest request){

        return new Response<>(HttpStatus.OK,new ExpenseCreationResponse());
    }




}
