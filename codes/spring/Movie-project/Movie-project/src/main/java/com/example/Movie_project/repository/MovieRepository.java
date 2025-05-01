package com.example.Movie_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie_project.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByUserId(Integer id);

}
