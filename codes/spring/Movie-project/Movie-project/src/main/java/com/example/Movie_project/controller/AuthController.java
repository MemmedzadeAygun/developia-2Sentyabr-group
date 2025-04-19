package com.example.Movie_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_project.dto.AuthRequestDto;
import com.example.Movie_project.exception.OurRuntimeException;
import com.example.Movie_project.repository.UserRepository;
import com.example.Movie_project.service.Authservice;

import jakarta.validation.Valid;


@RestController
@RequestMapping(path = "/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	
	@Autowired
	private Authservice service;

	@PostMapping(path = "/register")
	public String createUser(@Valid @RequestBody AuthRequestDto dto,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"");
		}
		return service.create(dto);
	}
	
}
