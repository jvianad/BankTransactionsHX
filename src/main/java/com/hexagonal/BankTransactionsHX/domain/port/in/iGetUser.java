package com.hexagonal.BankTransactionsHX.domain.port.in;
import com.hexagonal.BankTransactionsHX.domain.model.User;
import java.util.List;
import java.util.Optional;

public interface iGetUser {
    Optional<User> getUser(Long id);
    List<User> getAllUsers();
}