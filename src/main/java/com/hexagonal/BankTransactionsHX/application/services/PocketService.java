package com.hexagonal.BankTransactionsHX.application.services;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;
import com.hexagonal.BankTransactionsHX.domain.port.in.*;

import java.util.List;
import java.util.Optional;

public class PocketService implements iCreatePocket, iDeletePocket, iGetPocket, iTransferToPocket,iUpdatePocket{
    private final iCreatePocket createPocket;
    private final iDeletePocket deletePocket;
    private final iGetPocket getPocket;
    private final iUpdatePocket updatePocketUseCase;
    private final iTransferToPocket transferToPocket;

    public PocketService(iCreatePocket createPocket, iDeletePocket deletePocket, iGetPocket getPocket, iUpdatePocket updatePocket, iTransferToPocket transferToPocket) {
        this.createPocket = createPocket;
        this.deletePocket = deletePocket;
        this.getPocket = getPocket;
        this.updatePocketUseCase = updatePocket;
        this.transferToPocket = transferToPocket;
    }

    @Override
    public Pocket createPocket(Pocket pocket) {
        return createPocket.createPocket(pocket);
    }

    @Override
    public boolean deletePocket(Long id) {
        return deletePocket.deletePocket(id);
    }

    @Override
    public Optional<Pocket> getPocket(Long id) {
        return getPocket.getPocket(id);
    }

    @Override
    public List<Pocket> getAllPockets() {
        return getPocket.getAllPockets();
    }

    @Override
    public boolean tranfertoPocket(String accountNumber, String pocketNumber, double amount) {
        return transferToPocket.tranfertoPocket(accountNumber,pocketNumber,amount);
    }

    @Override
    public Optional<Pocket> updatePocket(Long id, Pocket updatePocket) {
        return updatePocketUseCase.updatePocket(id,updatePocket);
    }
}
