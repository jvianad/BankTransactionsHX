package com.hexagonal.BankTransactionsHX.domain.port.in;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;
import java.util.List;
import java.util.Optional;

public interface iGetPocket {
    Optional<Pocket> getPocket(Long id);
    List<Pocket> getAllPockets();
}
