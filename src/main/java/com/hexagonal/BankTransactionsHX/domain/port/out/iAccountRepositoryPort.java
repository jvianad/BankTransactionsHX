package com.hexagonal.BankTransactionsHX.domain.port.out;

import com.hexagonal.BankTransactionsHX.domain.model.Account;
import java.util.List;
import java.util.Optional;

public interface iAccountRepositoryPort {
    Account saveAccount(Account account);
    Optional<Account> findAccountById(Long id);
    boolean deleteAccount(Long id);
    List<Account> getAllAccounts();
    Optional<Account> updateAccount(Long id,Account account);
    boolean transferBetweenAccounts(String sourceAccountNumber, String destinationAccount, double amount);
    void deposit(String accountNumber, double amount);
    Account findByAccountNumber(String accountNumber);
}
