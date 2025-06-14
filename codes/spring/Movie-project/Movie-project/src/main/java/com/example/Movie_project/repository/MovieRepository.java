package com.example.Movie_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.Movie_project.entity.Movie;
import com.example.Movie_project.response.MovieResponse;

import jakarta.transaction.Transactional;

@Transactional
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByUserId(Integer id);

	@Query(value = "Delete from movies where user_id=?1",nativeQuery = true)
	@Modifying
	void deleteUserMovies(Integer userId);

	@Query(value = "Select title from movies",nativeQuery = true)
	List<String> getMovieNames();
}
