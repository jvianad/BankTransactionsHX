package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;
import com.hexagonal.BankTransactionsHX.domain.port.in.iUpdatePocket;
import com.hexagonal.BankTransactionsHX.domain.port.out.iPocketRepositoryPort;

import java.util.Optional;

public class UpdatePocketImpl implements iUpdatePocket {
    private final iPocketRepositoryPort pocketRepositoryPort;

    public UpdatePocketImpl(iPocketRepositoryPort pocketRepositoryPort) {
        this.pocketRepositoryPort = pocketRepositoryPort;
    }

    @Override
    public Optional<Pocket> updatePocket(Long id, Pocket updatePocket) {
        return pocketRepositoryPort.updatePocket(id, updatePocket);
    }
}
