package com.example.Movie_project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
public class MovieController {

	@GetMapping
	public String getMovie() {
		return "get movie";
	}
}
