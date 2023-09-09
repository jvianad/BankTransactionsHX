package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.User;
import com.hexagonal.BankTransactionsHX.domain.port.in.iCreateUser;
import com.hexagonal.BankTransactionsHX.domain.port.out.iUserRepositoryPort;

public class CreateUserImpl implements iCreateUser {
    private final iUserRepositoryPort userRepositoryPort;

    public CreateUserImpl(iUserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        return userRepositoryPort.saveUser(user);
    }
}
