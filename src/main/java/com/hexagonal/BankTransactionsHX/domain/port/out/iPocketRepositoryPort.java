package com.hexagonal.BankTransactionsHX.domain.port.out;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;

import java.util.List;
import java.util.Optional;

public interface iPocketRepositoryPort {
    Pocket savePocket(Pocket pocket);
    Optional<Pocket> findPocketById(Long id);
    boolean deletePocket(Long id);
    List<Pocket> getAllPockets();
    Optional<Pocket> updatePocket(Pocket pocket);
}
