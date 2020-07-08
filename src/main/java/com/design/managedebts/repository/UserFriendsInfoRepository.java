package com.design.managedebts.repository;

import com.design.managedebts.model.user.UserFriendsInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserFriendsInfoRepository extends PagingAndSortingRepository<UserFriendsInfo, Long> {
}
