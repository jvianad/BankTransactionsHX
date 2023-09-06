package com.hexagonal.BankTransactionsHX.domain.port.out;

import com.hexagonal.BankTransactionsHX.domain.model.Account;
import java.util.List;
import java.util.Optional;

public interface iAccountRepositoryPort {
    Account saveAccount(Account task);
    Optional<Account> findAccountById(Long id);
    boolean deleteAccount(Long id);
    List<Account> getAllAccounts();
    Optional<Account> updateAccount(Account account);
}
