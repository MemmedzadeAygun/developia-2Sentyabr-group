package az.developia.movie_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.movie_service.entity.MovieEntity;
import az.developia.movie_service.repository.MovieRepository;
import az.developia.movie_service.response.MovieListResponse;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	
	@GetMapping(path = "/user/{userId}")
	public MovieListResponse getUserMovies(@PathVariable Integer userId) {
		
		MovieListResponse response = new MovieListResponse();
		
		List<MovieEntity> movies = movieRepository.findAllByUserId(userId);
		
		response.setMovieResponse(movies);
		return response;
	}
}
