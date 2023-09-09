package com.hexagonal.BankTransactionsHX.application.services;


import com.hexagonal.BankTransactionsHX.domain.model.Account;
import com.hexagonal.BankTransactionsHX.domain.port.in.*;

import java.util.List;
import java.util.Optional;

public class AccountService implements iCreateAccount, iDeleteAccount, iDepositInAccount, iGetAccount, iTransferBetweenAccounts,iUpdateAccount {
    private final iCreateAccount createAccount;
    private final iDeleteAccount deleteAccount;
    private final iDepositInAccount depositInAccount;
    private final iUpdateAccount updateAccountUseCase;
    private final iGetAccount getAccount;
    private final iTransferBetweenAccounts transferBetweenAccounts;

    public AccountService(iCreateAccount createAccount, iDeleteAccount deleteAccount, iDepositInAccount depositInAccount, iUpdateAccount updateAccount, iGetAccount getAccount, iTransferBetweenAccounts transferBetweenAccounts) {
        this.createAccount = createAccount;
        this.deleteAccount = deleteAccount;
        this.depositInAccount = depositInAccount;
        this.updateAccountUseCase = updateAccount;
        this.getAccount = getAccount;
        this.transferBetweenAccounts = transferBetweenAccounts;
    }

    @Override
    public Account createAccount(Account account) {
        return createAccount.createAccount(account);
    }

    @Override
    public boolean deleteAccount(Long id) {
        return deleteAccount.deleteAccount(id);
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        depositInAccount.deposit(accountNumber,amount);
    }

    @Override
    public Optional<Account> getAccount(Long id) {
        return getAccount.getAccount(id);
    }

    @Override
    public List<Account> getAllAccounts() {
        return getAccount.getAllAccounts();
    }

    @Override
    public Account findByAccountNumber(String accountNumber) {
        return getAccount.findByAccountNumber(accountNumber);
    }

    @Override
    public boolean transfer(String sourceAccountNumber, String destinationAccount, double amount) {
        return transferBetweenAccounts.transfer(sourceAccountNumber,destinationAccount,amount);
    }

    @Override
    public Optional<Account> updateAccount(Long id, Account updateAccount) {
        return updateAccountUseCase.updateAccount(id,updateAccount);
    }
}
