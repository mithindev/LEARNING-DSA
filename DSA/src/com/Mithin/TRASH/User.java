package com.Mithin.TRASH;

import java.util.List;

public class User {
    private int userID;
    private String name;
    private EWallet wallet;

    public User(int userID, String name, float limit) {
        this.userID = userID;
        this.name = name;
        wallet = new EWallet();
        wallet.limit = limit;
    }

    public User(int userID, String name) {
        this.userID = userID;
        this.name = name;
        wallet = new EWallet();
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public EWallet getWallet() {
        return wallet;
    }

    public void rechargeWallet(float amount) {
        wallet.recharge(amount);
    }

    public void debitWallet(float amount) {
        wallet.debit(amount);
    }



    public List<Transaction> viewWalletTransactions() {
        return wallet.viewTransactions();
    }
}
