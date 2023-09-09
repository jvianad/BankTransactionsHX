package com.hexagonal.BankTransactionsHX.application.usecases;

import com.hexagonal.BankTransactionsHX.domain.port.in.iDeleteUser;
import com.hexagonal.BankTransactionsHX.domain.port.out.iUserRepositoryPort;


public class DeleteUserImpl implements iDeleteUser {
    private final iUserRepositoryPort userRepositoryPort;

    public DeleteUserImpl(iUserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepositoryPort.deleteUser(id);
    }
}
