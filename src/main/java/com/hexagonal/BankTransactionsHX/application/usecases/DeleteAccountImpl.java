package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.port.in.iDeleteAccount;
import com.hexagonal.BankTransactionsHX.domain.port.out.iAccountRepositoryPort;

public class DeleteAccountImpl implements iDeleteAccount {
    private final iAccountRepositoryPort accountRepositoryPort;
    public DeleteAccountImpl(iAccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }
    @Override
    public boolean deleteAccount(Long id) {
        return accountRepositoryPort.deleteAccount(id);
    }
}
