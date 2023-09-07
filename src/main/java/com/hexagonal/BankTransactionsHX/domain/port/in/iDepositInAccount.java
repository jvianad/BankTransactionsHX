package com.hexagonal.BankTransactionsHX.domain.port.in;

public interface iDepositInAccount {
    void deposit(String accountNumber, double amount);
}
