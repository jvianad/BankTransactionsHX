package com.hexagonal.BankTransactionsHX.domain.port.in;

public interface iTransferToPocket {
    boolean tranfertoPocket(String accountNumber, Long id, double amount);
}
