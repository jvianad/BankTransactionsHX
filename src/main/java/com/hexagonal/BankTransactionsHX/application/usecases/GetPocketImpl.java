package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;
import com.hexagonal.BankTransactionsHX.domain.port.in.iGetPocket;
import com.hexagonal.BankTransactionsHX.domain.port.out.iPocketRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetPocketImpl implements iGetPocket {
    private final iPocketRepositoryPort pocketRepositoryPort;

    public GetPocketImpl(iPocketRepositoryPort pocketRepositoryPort) {
        this.pocketRepositoryPort = pocketRepositoryPort;
    }

    @Override
    public Optional<Pocket> getPocket(Long id) {
        return pocketRepositoryPort.findPocketById(id);
    }

    @Override
    public List<Pocket> getAllPockets() {
        return pocketRepositoryPort.getAllPockets();
    }
}
