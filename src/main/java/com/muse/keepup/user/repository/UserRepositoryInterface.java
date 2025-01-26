package com.muse.keepup.user.repository;

import com.muse.keepup.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepositoryInterface  extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
