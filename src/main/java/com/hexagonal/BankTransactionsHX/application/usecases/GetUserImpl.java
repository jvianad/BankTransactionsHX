package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.model.User;
import com.hexagonal.BankTransactionsHX.domain.port.in.iGetUser;
import com.hexagonal.BankTransactionsHX.domain.port.out.iUserRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetUserImpl implements iGetUser {
    private final iUserRepositoryPort userRepositoryPort;

    public GetUserImpl(iUserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepositoryPort.findUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryPort.getAllUser();
    }
}
