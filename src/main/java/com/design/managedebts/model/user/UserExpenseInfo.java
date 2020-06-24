package com.design.managedebts.model.user;

import javax.persistence.*;

@Entity
@Table(name = "user_expense_info")
public class UserExpenseInfo {


    // TODO : make composite key of userId and compositeId

    long expenseId;

    long userId;

    public UserExpenseInfo() {

    }

    public UserExpenseInfo(long expenseId, long userId) {
        this.expenseId = expenseId;
        this.userId = userId;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserExpenseInfo{" +
                "expenseId=" + expenseId +
                ", userId=" + userId +
                '}';
    }
}
