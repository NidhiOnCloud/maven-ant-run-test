package com.poc.practice.spring.security.jwt.repository;

import com.poc.practice.spring.security.jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
