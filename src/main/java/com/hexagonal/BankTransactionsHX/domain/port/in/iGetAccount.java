package com.hexagonal.BankTransactionsHX.domain.port.in;

import com.hexagonal.BankTransactionsHX.domain.model.Account;
import java.util.List;
import java.util.Optional;

public interface iGetAccount {
    Optional<Account> getAccount(Long id);
    List<Account> getAllAccounts();
    Account findByAccountNumber(String accountNumber);
}
