package com.example.Movie_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Movie_project.entity.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

	User getUserByUsername(String username);
}
