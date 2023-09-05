package com.hexagonal.BankTransactionsHX.domain.port.in;
import com.hexagonal.BankTransactionsHX.domain.model.Account;

public interface iCreateAccount {
    Account createAccount(Account account);
}
