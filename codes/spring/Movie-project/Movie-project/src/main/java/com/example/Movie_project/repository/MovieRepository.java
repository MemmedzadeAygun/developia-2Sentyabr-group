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
	
	// Select * from movies limit 0, 10
	@Query(value = "Select * from movies limit ?1, ?2",nativeQuery = true)
	List<Movie> pagination(Integer b, Integer l);
	
	//0 - 30
	//30 - 60
	//60 - 90
	
}
