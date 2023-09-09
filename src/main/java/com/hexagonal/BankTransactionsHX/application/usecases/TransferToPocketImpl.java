package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.port.in.iTransferToPocket;
import com.hexagonal.BankTransactionsHX.domain.port.out.iPocketRepositoryPort;

public class TransferToPocketImpl implements iTransferToPocket {

    private final iPocketRepositoryPort pocketRepositoryPort;

    public TransferToPocketImpl(iPocketRepositoryPort pocketRepositoryPort) {
        this.pocketRepositoryPort = pocketRepositoryPort;
    }

    @Override
    public boolean tranfertoPocket(String accountNumber, String pocketNumber, double amount) {
        return pocketRepositoryPort.tranfertoPocket(accountNumber,pocketNumber,amount);
    }
}
