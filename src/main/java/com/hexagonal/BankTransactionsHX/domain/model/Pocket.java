package com.hexagonal.BankTransactionsHX.domain.model;

public class Pocket {
    private Integer id;

    private String pocketName;

    private double initial_balance;

    public Pocket() {
    }

    public Pocket(Integer id, String pocketName, double initial_balance) {
        this.id = id;
        this.pocketName = pocketName;
        this.initial_balance = initial_balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPocketName() {
        return pocketName;
    }

    public void setPocketName(String pocketName) {
        this.pocketName = pocketName;
    }

    public double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(double initial_balance) {
        this.initial_balance = initial_balance;
    }
}
