package com.example.Movie_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_project.dto.MovieRequestDto;
import com.example.Movie_project.entity.Movie;
import com.example.Movie_project.response.MovieResponse;
import com.example.Movie_project.service.MovieService;


@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@GetMapping
	public String getMovie() {
		return "get movie";
	}
	
	@PostMapping(path = "/add")
	@PreAuthorize("hasAuthority('ROLE_ADD_MOVIE')")
	public void create(@RequestBody MovieRequestDto dto) {
		movieService.add(dto);
	}
	
	@GetMapping(path = "/getAll")
	public MovieResponse getAll() {
		return movieService.get();
	}
	
	@GetMapping(path = "/title")
	public List<String> getMovieTitles(){
		return movieService.getMovieTitle();
	} 
	
	@DeleteMapping(path = "/{id}")
	public void deleteMovie(@PathVariable Integer id) {
		movieService.delete(id);
	}
	
}
