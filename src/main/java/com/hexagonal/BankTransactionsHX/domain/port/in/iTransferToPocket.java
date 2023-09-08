package com.hexagonal.BankTransactionsHX.domain.port.in;

public interface iTransferToPocket {
    boolean tranfertoPocket(String accountNumber, String pocketNumber, double amount);
}