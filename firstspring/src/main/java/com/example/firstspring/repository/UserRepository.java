package com.example.firstspring.repository;

import com.example.firstspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{
    Optional<User> findUserByUserName(String username);
    Optional<User> findUsersByEmail(String email);
    Optional<User> findUsersById(Long id);
}
