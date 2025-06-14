package com.example.Movie_project.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.Movie_project.dto.MovieRequestDto;
import com.example.Movie_project.entity.Movie;
import com.example.Movie_project.entity.User;
import com.example.Movie_project.exception.OurRuntimeException;
import com.example.Movie_project.repository.MovieRepository;
import com.example.Movie_project.repository.UserRepository;
import com.example.Movie_project.response.MovieResponse;
import com.example.Movie_project.response.MovieResponseDto;

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
//		response.setMovies(movieRepository.findByUserId(id));
		
		List<Movie> movies = movieRepository.findByUserId(id); 
		Function<Movie, String> f = new Function<Movie, String>() {
			
			@Override
			public String apply(Movie t) {
				return t.getTitle();
			}
		};
		
		Predicate<String> pre=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.contains("a");
			}
		};
		
		List<String> filteredMovies = movies.stream()
		.map(f).filter(pre).collect(Collectors.toList());
		
		response.setMovies(filteredMovies);
		

		return response;
	}

	public List<String> getMovieTitle() {
		return movieRepository.getMovieNames();
	}

	public void delete(Integer id) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User operatorUser = userRepository.getUserByUsername(username);

		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		
		Supplier<OurRuntimeException> s = new Supplier<OurRuntimeException>() {
			
			@Override
			public OurRuntimeException get() {
				return new OurRuntimeException(null, "id tapilmadi");
			}
		};
		
		Movie movie = movieRepository.findById(id).orElseThrow(s);

		if (movie.getUserId() == operatorUser.getId()) {
			movieRepository.deleteById(id);

		} else {
			throw new OurRuntimeException(null, "oz filminini sil");
		}
	}

	public MovieResponseDto getMovieById(Integer id) {
		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<Movie> movie = movieRepository.findById(id);
		if (movie.isPresent()) {
			MovieResponseDto res = new MovieResponseDto();
			res.setId(movie.get().getId());
			res.setGenre(movie.get().getGenre());
			res.setRating(movie.get().getRating());
			res.setTitle(movie.get().getTitle());
			return res;
		}else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}

}
