package com.SecurityGraduations.EmperorPenguin.Login.repository;

import com.SecurityGraduations.EmperorPenguin.Login.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById (String id);
    List<User> findAll();
}
