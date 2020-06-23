package com.design.managedebts.model.expense;

import com.design.managedebts.enums.ExpenseType;
import com.design.managedebts.enums.SplitType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class ExpenseDetails {

    Long id;

    @Enumerated(EnumType.STRING)
    ExpenseType type;

    @Enumerated(EnumType.STRING)
    SplitType splitType;

    Long createdby;

    Long paidBy;

    String note;

    Double totalAmount;

    public ExpenseDetails(){

    }

    public ExpenseDetails(Long id, ExpenseType type,SplitType splitType, Long createdby, Long paidBy, String note,
                          Double totalAmount) {
        this.id = id;
        this.type = type;
        this.createdby = createdby;
        this.paidBy = paidBy;
        this.note = note;
        this.totalAmount=totalAmount;
        this.splitType=splitType;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public ExpenseType getType() {
        return type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Long getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(Long paidBy) {
        this.paidBy = paidBy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "ExpenseDetails{" +
                "id=" + id +
                ", type=" + type +
                ", createdby=" + createdby +
                ", paidBy=" + paidBy +
                ", note='" + note + '\'' +
                ", totalAmount ='" + totalAmount + '\'' +
                '}';
    }

}
