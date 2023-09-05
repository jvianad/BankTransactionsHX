package com.hexagonal.BankTransactionsHX.domain.port.in;
import com.hexagonal.BankTransactionsHX.domain.model.Account;
import java.util.Optional;

public interface iUpdateAccount {
    Optional<Account> updateAccount(Long id, Account updateAccount);
}