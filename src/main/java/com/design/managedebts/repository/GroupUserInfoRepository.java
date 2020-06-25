package com.design.managedebts.repository;

import com.design.managedebts.model.group.GroupUserInfo;
import com.design.managedebts.model.group.GroupUserInfoId;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupUserInfoRepository extends PagingAndSortingRepository<GroupUserInfo, GroupUserInfoId> {
}
