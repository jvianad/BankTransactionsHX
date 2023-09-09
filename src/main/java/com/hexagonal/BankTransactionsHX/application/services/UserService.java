package com.hexagonal.BankTransactionsHX.application.services;


import com.hexagonal.BankTransactionsHX.domain.model.User;
import com.hexagonal.BankTransactionsHX.domain.port.in.iCreateUser;
import com.hexagonal.BankTransactionsHX.domain.port.in.iDeleteUser;
import com.hexagonal.BankTransactionsHX.domain.port.in.iGetUser;
import com.hexagonal.BankTransactionsHX.domain.port.in.iUpdateUser;

import java.util.List;
import java.util.Optional;

public class UserService implements iCreateUser, iDeleteUser, iGetUser, iUpdateUser {

    private final iCreateUser createUser;
    private final iDeleteUser deleteUser;
    private final iGetUser getUser;
    private final iUpdateUser updateUserUseCase;

    public UserService(iCreateUser createUser, iDeleteUser deleteUser, iGetUser getUser, iUpdateUser updateUser) {
        this.createUser = createUser;
        this.deleteUser = deleteUser;
        this.getUser = getUser;
        this.updateUserUseCase = updateUser;
    }

    @Override
    public User createUser(User user) {
        return createUser.createUser(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return deleteUser.deleteUser(id);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return getUser.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return getUser.getAllUsers();
    }

    @Override
    public Optional<User> updateUser(Long id, User updateUser) {
        return updateUserUseCase.updateUser(id,updateUser);
    }
}
