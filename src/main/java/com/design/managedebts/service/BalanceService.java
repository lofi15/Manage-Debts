package com.design.managedebts.service;

import com.design.managedebts.model.expense.BalanceDetails;
import com.design.managedebts.repository.BalanceDetailsRepository;
import com.design.managedebts.request.CreateExpenseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BalanceService {

    @Autowired
    BalanceDetailsRepository balanceDetailsRepository;

    public void createDebtRecords(CreateExpenseRequest request,Long expenseId){

        Long lenderId = request.getPaidBy();
        //long lenderId, long borrowerId, double amount, long expenseId
        List<BalanceDetails> balanceDetailsList = new ArrayList<>();

        request.getBalances().keySet().stream().forEach(
                (borrowerId)->{
                balanceDetailsList.add(
                    new BalanceDetails(lenderId,borrowerId,request.getBalances().get(borrowerId),expenseId)
                );
            }
        );

        balanceDetailsRepository.saveAll(balanceDetailsList);

    }

}
