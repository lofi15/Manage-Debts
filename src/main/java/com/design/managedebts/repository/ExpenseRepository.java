package com.design.managedebts.repository;

import com.design.managedebts.model.expense.ExpenseDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends PagingAndSortingRepository<ExpenseDetails,Long> {

}
