package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.port.in.iTransferBetweenAccounts;
import com.hexagonal.BankTransactionsHX.domain.port.out.iAccountRepositoryPort;

public class TransferBetweenAccountImpl implements iTransferBetweenAccounts {
    private final iAccountRepositoryPort accountRepositoryPort;

    public TransferBetweenAccountImpl(iAccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public boolean transfer(String sourceAccountNumber, String destinationAccount, double amount) {
        return accountRepositoryPort.transferBetweenAccounts(sourceAccountNumber,destinationAccount,amount);
    }
}
