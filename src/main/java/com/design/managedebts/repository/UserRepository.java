package com.design.managedebts.repository;

import com.design.managedebts.model.user.UserDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<UserDetails,Long> {
}
