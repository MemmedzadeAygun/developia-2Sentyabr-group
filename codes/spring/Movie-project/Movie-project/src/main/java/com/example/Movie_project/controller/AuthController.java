package com.example.Movie_project.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie_project.dto.AuthRequestDto;
import com.example.Movie_project.exception.OurRuntimeException;
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
	
	@PostMapping(path = "/login")
	public String login(@RequestBody AuthRequestDto dto) {
		return service.login(dto);
	}
	
	@GetMapping(path = "/profile")
	public ResponseEntity<Map<String, Object>> getUserDetails(@RequestHeader("Authorization") String token){
		return service.getUserDetail(token);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
