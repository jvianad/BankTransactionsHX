package com.hexagonal.BankTransactionsHX.domain.model;

public class Pocket {
    private Integer id;
    private String pocketNumber;
    private String pocketName;
    private double initialBalance;

    public Pocket() {
    }

    public Pocket(Integer id, String pocketNumber, String pocketName, double initialBalance) {
        this.id = id;
        this.pocketNumber = pocketNumber;
        this.pocketName = pocketName;
        this.initialBalance = initialBalance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPocketNumber() {
        return pocketNumber;
    }

    public void setPocketNumber(String pocketNumber) {
        this.pocketNumber = pocketNumber;
    }

    public String getPocketName() {
        return pocketName;
    }

    public void setPocketName(String pocketName) {
        this.pocketName = pocketName;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
}
