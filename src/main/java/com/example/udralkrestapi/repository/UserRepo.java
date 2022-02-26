package com.example.udralkrestapi.repository;

import com.example.udralkrestapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
