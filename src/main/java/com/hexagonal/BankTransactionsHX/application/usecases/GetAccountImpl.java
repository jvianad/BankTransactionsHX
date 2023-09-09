package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.Account;
import com.hexagonal.BankTransactionsHX.domain.port.in.iGetAccount;
import com.hexagonal.BankTransactionsHX.domain.port.out.iAccountRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetAccountImpl implements iGetAccount {

    private final iAccountRepositoryPort accountRepositoryPort;

    public GetAccountImpl(iAccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public Optional<Account> getAccount(Long id) {
        return accountRepositoryPort.findAccountById(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepositoryPort.getAllAccounts();
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        return accountRepositoryPort.findByAccountNumber(accountNumber);
    }
}
