package com.example.Movie_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.Movie_project.dto.MovieRequestDto;
import com.example.Movie_project.entity.Movie;
import com.example.Movie_project.entity.User;
import com.example.Movie_project.repository.MovieRepository;
import com.example.Movie_project.repository.UserRepository;
import com.example.Movie_project.response.MovieResponse;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;

	public void add(MovieRequestDto dto) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		Movie movie = new Movie();
		movie.setId(null);
		movie.setGenre(dto.getGenre());
		movie.setRating(dto.getRating());
		movie.setTitle(dto.getTitle());
		movie.setUserId(id);
		movieRepository.save(movie);
	}

	public MovieResponse get() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		MovieResponse response = new MovieResponse();
		response.setMovies(movieRepository.findByUserId(id));
		return response;
	}

}
