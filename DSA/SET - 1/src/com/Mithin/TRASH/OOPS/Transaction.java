package com.Mithin.TRASH.OOPS;

public class Transaction {
    private String timestamp;
    private float amount;
    private String type;

    public Transaction(String timestamp, float amount, String type) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public float getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
