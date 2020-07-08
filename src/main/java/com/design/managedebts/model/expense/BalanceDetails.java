package com.design.managedebts.model.expense;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "balance_details")
public class BalanceDetails {

    // index on expenseId

    // here primary key can constitute of lenderId and borrowerId and expenseId

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long lenderId;

    private long borrowerId;

    private double amount;

    private long expenseId;

    private LocalDateTime createdAt;

    public BalanceDetails() {

    }

    public BalanceDetails(long lenderId, long borrowerId, double amount, long expenseId) {
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.amount = amount;
        this.expenseId = expenseId;
    }

    public long getLenderId() {
        return lenderId;
    }

    public void setLenderId(long lenderId) {
        this.lenderId = lenderId;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    @Override
    public String toString() {
        return "BalanceDetails{" +
                "lenderId=" + lenderId +
                ", borrowerId=" + borrowerId +
                ", amount=" + amount +
                ", expenseId=" + expenseId +
                '}';
    }
}
