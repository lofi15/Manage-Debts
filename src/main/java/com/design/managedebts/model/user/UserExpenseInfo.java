package com.design.managedebts.model.user;

public class UserExpenseInfo {

    long expenseId;

    long userId;

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
