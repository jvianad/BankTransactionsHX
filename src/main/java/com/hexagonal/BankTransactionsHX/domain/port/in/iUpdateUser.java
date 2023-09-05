package com.hexagonal.BankTransactionsHX.domain.port.in;

import com.hexagonal.BankTransactionsHX.domain.model.User;

import java.util.Optional;

public interface iUpdateUser {
    Optional<User> updateTask(Long id, User updateUser);
}
