package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;
import com.hexagonal.BankTransactionsHX.domain.port.in.iCreatePocket;
import com.hexagonal.BankTransactionsHX.domain.port.out.iPocketRepositoryPort;

public class CreatePocketImpl implements iCreatePocket {
    private final iPocketRepositoryPort pocketRepositoryPort;
    public CreatePocketImpl(iPocketRepositoryPort pocketRepositoryPort) {
        this.pocketRepositoryPort = pocketRepositoryPort;
    }
    @Override
    public Pocket createPocket(Pocket pocket) {
        return pocketRepositoryPort.savePocket(pocket);
    }
}
