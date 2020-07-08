package com.design.managedebts.model.group;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "group_expense_info")
@IdClass(GroupExpenseInfoId.class)
public class GroupExpenseInfo implements Serializable {

    // make composite key of groupId and expenseId

    @Id
    private long groupId;

    @Id
    private long expenseId;

    public GroupExpenseInfo() {
    }

    public GroupExpenseInfo(long groupId, long expenseId) {
        this.groupId = groupId;
        this.expenseId = expenseId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    @Override
    public String toString() {
        return "GroupExpenseInfo{" +
                "groupId=" + groupId +
                ", expenseId=" + expenseId +
                '}';
    }
}
