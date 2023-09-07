package com.hexagonal.BankTransactionsHX.domain.port.in;

public interface iTransferBetweenAccounts {
    boolean transfer(String sourceAccountNumber, String destinationAccount, double amount);
}
