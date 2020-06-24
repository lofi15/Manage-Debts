package com.design.managedebts.model.expense;

import com.design.managedebts.enums.ExpenseType;
import com.design.managedebts.enums.SplitType;
import com.design.managedebts.request.CreateExpenseRequest;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "expense_details")
public class ExpenseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ExpenseType type;

    @Enumerated(EnumType.STRING)
    private SplitType splitType;

    private Long createdby;

    private Long paidBy;

    private String note;

    private Double totalAmount;

    private LocalDateTime createdOn;

    public ExpenseDetails(){

    }

    public ExpenseDetails(ExpenseType type,SplitType splitType, Long createdby, Long paidBy, String note,
                          Double totalAmount) {
        this.type = type;
        this.createdby = createdby;
        this.paidBy = paidBy;
        this.note = note;
        this.totalAmount=totalAmount;
        this.splitType=splitType;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
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
