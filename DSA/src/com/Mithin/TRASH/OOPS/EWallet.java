package com.Mithin.TRASH.OOPS;

import java.util.ArrayList;
import java.util.List;

public class EWallet {
    private float balance;

    protected float limit;
    private List<Transaction> transactions;

    public EWallet() {
        balance = 0.0f;
        transactions = new ArrayList<>();
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void recharge(float amount) {

        balance += amount;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public void debit(float amount) {
        balance -= amount;
    }

    public List<Transaction> viewTransactions() {
        return transactions;
    }
}
