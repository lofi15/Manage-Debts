package com.design.managedebts.repository;

import com.design.managedebts.model.expense.ExpenseDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ExpenseRepository extends PagingAndSortingRepository<ExpenseDetails,Long> {

}
