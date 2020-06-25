package com.design.managedebts.model.group;

import java.io.Serializable;
import java.util.Objects;

public class GroupExpenseInfoId implements Serializable {

    private long groupId;

    private long expenseId;

    public GroupExpenseInfoId(long groupId, long expenseId) {
        this.groupId = groupId;
        this.expenseId = expenseId;
    }

    public GroupExpenseInfoId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupExpenseInfoId)) return false;
        GroupExpenseInfoId that = (GroupExpenseInfoId) o;
        return groupId == that.groupId &&
                expenseId == that.expenseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, expenseId);
    }
}
