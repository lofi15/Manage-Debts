package com.design.managedebts.request;

import java.util.List;

public class CreateGroupRequest {

    private String name;

    private List<Long> members;

    private Long createdBy;

    public CreateGroupRequest(String name, List<Long> members, Long createdBy) {
        this.name = name;
        this.members = members;
        this.createdBy = createdBy;
    }

    public CreateGroupRequest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getMembers() {
        return members;
    }

    public void setMembers(List<Long> members) {
        this.members = members;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }
}
