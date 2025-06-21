package com.example.Movie_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_project.entity.TestEntity;

public interface ViewRepository extends JpaRepository<TestEntity, Integer>{

}
