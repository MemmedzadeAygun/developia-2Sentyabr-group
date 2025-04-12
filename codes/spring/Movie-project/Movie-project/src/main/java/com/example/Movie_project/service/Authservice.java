package com.example.Movie_project.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Movie_project.dto.AuthRequestDto;
import com.example.Movie_project.entity.User;
import com.example.Movie_project.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Authservice {
	
	private final UserRepository userRepository; //123
	private final PasswordEncoder passwordEncoder;

	public String create(AuthRequestDto dto) {
		String encode = passwordEncoder.encode(dto.getPassword());
		
		User user = new User();
		user.setFirstName(dto.getFirstName());
		user.setLastName(dto.getLastName());
		user.setUsername(dto.getUsername());
		user.setEmail(dto.getEmail());
		user.setPassword(encode);
		userRepository.save(user);
		return "User create successfully";
		
	}

}
