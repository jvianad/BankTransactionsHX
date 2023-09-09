package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.User;
import com.hexagonal.BankTransactionsHX.domain.port.in.iUpdateUser;
import com.hexagonal.BankTransactionsHX.domain.port.out.iUserRepositoryPort;

import java.util.Optional;

public class UpdateUserImpl implements iUpdateUser {
    private final iUserRepositoryPort userRepositoryPort;

    public UpdateUserImpl(iUserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return userRepositoryPort.updateUser(id,updateUser);
    }
}
