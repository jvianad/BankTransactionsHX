package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.Account;
import com.hexagonal.BankTransactionsHX.domain.port.in.iCreateAccount;
import com.hexagonal.BankTransactionsHX.domain.port.out.iAccountRepositoryPort;

public class CreateAccountImpl implements iCreateAccount {

    private final iAccountRepositoryPort accountRepositoryPort;

    public CreateAccountImpl(iAccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepositoryPort.saveAccount(account);
    }
}
