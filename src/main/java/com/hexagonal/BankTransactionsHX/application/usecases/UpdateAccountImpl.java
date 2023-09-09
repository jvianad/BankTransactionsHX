package com.hexagonal.BankTransactionsHX.application.usecases;


import com.hexagonal.BankTransactionsHX.domain.model.Account;
import com.hexagonal.BankTransactionsHX.domain.port.in.iUpdateAccount;
import com.hexagonal.BankTransactionsHX.domain.port.out.iAccountRepositoryPort;

import java.util.Optional;

public class UpdateAccountImpl implements iUpdateAccount {
    private final iAccountRepositoryPort accountRepositoryPort;

    public UpdateAccountImpl(iAccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Optional<Account> updateAccount(Long id, Account updateAccount) {
        return accountRepositoryPort.updateAccount(id,updateAccount);
    }
}
