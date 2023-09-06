package com.hexagonal.BankTransactionsHX.domain.port.out;

import com.hexagonal.BankTransactionsHX.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface iUserRepositoryPort {
    User saveUser(User user);
    Optional<User> findUserById(Long id);
    boolean deleteUser(Long id);
    List<User> getAllUser();
    Optional<User> updateUser(User task);
}
