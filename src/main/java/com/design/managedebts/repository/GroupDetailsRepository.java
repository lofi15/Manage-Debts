package com.design.managedebts.repository;
import com.design.managedebts.model.group.Group;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GroupDetailsRepository extends PagingAndSortingRepository<Group,Long> {

}
