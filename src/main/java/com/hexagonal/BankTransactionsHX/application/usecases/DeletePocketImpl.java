package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.port.in.iDeletePocket;
import com.hexagonal.BankTransactionsHX.domain.port.out.iPocketRepositoryPort;

public class DeletePocketImpl implements iDeletePocket {
    private final iPocketRepositoryPort pocketRepositoryPort;

    public DeletePocketImpl(iPocketRepositoryPort pocketRepositoryPort) {
        this.pocketRepositoryPort = pocketRepositoryPort;
    }

    @Override
    public boolean deletePocket(Long id) {
        return pocketRepositoryPort.deletePocket(id);
    }
}
