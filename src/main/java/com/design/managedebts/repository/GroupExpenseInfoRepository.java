package com.design.managedebts.repository;

import com.design.managedebts.model.group.GroupExpenseInfo;
import com.design.managedebts.model.group.GroupExpenseInfoId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupExpenseInfoRepository extends PagingAndSortingRepository<GroupExpenseInfo, GroupExpenseInfoId> {



}
