package com.example.ScheduleBackend.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ScheduleBackend.Model.UserTable;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Long> {
    Optional<UserTable> findByUsername(String username);
}