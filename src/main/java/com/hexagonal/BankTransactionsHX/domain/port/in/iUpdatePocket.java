package com.hexagonal.BankTransactionsHX.domain.port.in;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;

import java.util.Optional;

public interface iUpdatePocket {
    Optional<Pocket> updatePocket(Long id, Pocket updatePocket);
}
