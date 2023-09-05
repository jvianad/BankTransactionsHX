package com.hexagonal.BankTransactionsHX.domain.model;

public class Account {
    private Long id;
    private String accountNumber;
    private String owner;
    private double initial_balance;
    private boolean isEnable;

    public Account() {
    }

    public Account(Long id, String accountNumber, String owner, double initial_balance, boolean isEnable) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.initial_balance = initial_balance;
        this.isEnable = isEnable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(double initial_balance) {
        this.initial_balance = initial_balance;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
