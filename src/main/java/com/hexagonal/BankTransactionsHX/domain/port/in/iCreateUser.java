package com.hexagonal.BankTransactionsHX.domain.port.in;
import com.hexagonal.BankTransactionsHX.domain.model.User;

public interface iCreateUser {
    User createUser(User user);
}
