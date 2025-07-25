package com.example.Movie_project.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_project.dto.MovieRequestDto;
import com.example.Movie_project.dynamic.DynamicFiltering;
import com.example.Movie_project.entity.Movie;
import com.example.Movie_project.entity.TestEntity;
import com.example.Movie_project.exception.OurRuntimeException;
import com.example.Movie_project.repository.MovieRepository;
import com.example.Movie_project.response.MovieListResponseModel;
import com.example.Movie_project.response.MovieResponse;
import com.example.Movie_project.response.MovieResponseDto;
import com.example.Movie_project.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Movie Controller",description = "Movie apileri")
public class MovieController {
	
	private Logger log = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private DynamicFiltering filtering;
	
	
//	@GetMapping
//	public String getMovie() {
//		return "get movie";
//	}
	

	@PostMapping(path = "/add")
	@PreAuthorize("hasAuthority('ROLE_ADD_MOVIE')")
	public void create(@RequestBody MovieRequestDto dto) {
		movieService.add(dto);
	}

	@GetMapping(path = "/getAll")
	
	@Operation(
			description = "Get api for Movie",
			summary = "This is a summary for Movie get api"
			)
	public MovieResponse getAll() {
		log.info("GET movies/getAll cagirildi");
		return movieService.get();
	}
	
	
	// /movies/pagination/begin/0/length/10
	@GetMapping(path = "/pagination/begin/{begin}/length/{length}")
	public List<Movie> pagination(@PathVariable Integer begin, @PathVariable Integer length) {
		return movieService.findpagination(begin, length);
	}
	

	@GetMapping(path = "/title")
	public List<String> getMovieTitles() {
		return movieService.getMovieTitle();
	}

	@DeleteMapping(path = "/{id}")
	public void deleteMovie(@PathVariable Integer id) {
		movieService.delete(id);
	}
	
	@GetMapping(path = "/{id}",produces = {"application/json","application/xml"}) 
//	movies/nese
	public MovieResponseDto  getById(@PathVariable Integer id) {
		return movieService.getMovieById(id);
	}
	
	
	@GetMapping(path = "/view")
	public List<TestEntity> getView(){
		return movieService.findView();
	}
	
	@PutMapping(path = "/update")
	public void movieUpdate(@Valid @RequestBody MovieRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "");
		}
		log.info("PUT api cagirildi" + dto);
		movieService.update(dto);
	}
	
	
	@GetMapping(path = "/id-title")
	public MappingJacksonValue getMovieIdTitle() {
		MovieListResponseModel response = new MovieListResponseModel();
		List<Movie> movies = movieRepository.findAll();
		
		response.setMovieResponse(movieService.convertMovieToResponseModel(movies));
		return filtering.filter("movies", response, "id","title");
	}
	
	@GetMapping(path = "/title-genre")
	public MappingJacksonValue getMovieTitleGenre() {
		MovieListResponseModel response = new MovieListResponseModel();
		List<Movie> movies = movieRepository.findAll();
		
		response.setMovieResponse(movieService.convertMovieToResponseModel(movies));
		return filtering.filter("movies", response, "title","genre");
	}
	
}
