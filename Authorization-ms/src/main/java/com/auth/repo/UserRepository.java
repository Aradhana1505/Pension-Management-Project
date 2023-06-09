package com.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);
}
