package com.design.managedebts.request;

import com.design.managedebts.enums.ExpenseType;
import com.design.managedebts.enums.SplitType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CreateExpenseRequest {

    private Long paidBy;

    private Map<Long,Double> balances;

    private Double totalAmount;

    private ExpenseType expenseType;

    private Long createdBy;

    private String note;

    private SplitType splitType;

    private Long groupId;

    public CreateExpenseRequest() {

    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Long paidBy) {
        this.paidBy = paidBy;
    }

    public Map<Long, Double> getBalances() {
        return balances;
    }

    public void setBalances(Map<Long, Double> balances) {
        this.balances = balances;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    @Override
    public String toString() {
        return "CreateExpenseRequest{" +
                "paidBy=" + paidBy +
                ", balances=" + balances +
                ", totalAmount=" + totalAmount +
                ", expenseType=" + expenseType +
                ", note='" + note + '\'' +
                ", splitType=" + splitType +
                '}';
    }
}
