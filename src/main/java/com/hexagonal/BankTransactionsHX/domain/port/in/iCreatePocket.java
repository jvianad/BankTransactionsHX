package com.hexagonal.BankTransactionsHX.domain.port.in;

import com.hexagonal.BankTransactionsHX.domain.model.Pocket;

public interface iCreatePocket {
    Pocket createPocket(Pocket pocket);
}
