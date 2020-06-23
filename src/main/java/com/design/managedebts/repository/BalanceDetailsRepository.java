package com.design.managedebts.repository;

import com.design.managedebts.model.expense.BalanceDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BalanceDetailsRepository extends PagingAndSortingRepository<BalanceDetails,Long> {

}
