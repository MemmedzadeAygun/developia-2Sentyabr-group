package com.example.Movie_project.service;

import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Movie_project.dto.AuthRequestDto;
import com.example.Movie_project.entity.User;
import com.example.Movie_project.exception.InvalidCredentialsException;
import com.example.Movie_project.exception.OurRuntimeException;
import com.example.Movie_project.repository.MovieRepository;
import com.example.Movie_project.repository.UserRepository;
import com.example.Movie_project.util.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Authservice {

	private final UserRepository userRepository; // 123
	private final MovieRepository movieRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtUtil jwtUtil;

	public String create(AuthRequestDto dto) {
		Optional<User> byUsername = userRepository.findByUsername(dto.getUsername());
		if (byUsername.isPresent()) {
			throw new OurRuntimeException(null, "Username is exists");
		}

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

	public String login(AuthRequestDto dto) {
		Optional<User> user = userRepository.findByUsername(dto.getUsername());

		if (!user.isPresent() || !passwordEncoder.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or pasword incorrect");
		}

		return jwtUtil.generateToken(user.get().getUsername(),user.get().getFirstName(),user.get().getLastName(),user.get().getEmail());
	}

	public ResponseEntity<Map<String, String>> getUserDetail(String token) {
		if (token.startsWith("Bearer")) {
			token=token.substring(7);
		}
		Map<String,String> claims = jwtUtil.extractClaims(token);
		return ResponseEntity.ok(claims);
	}

	public void delete(Integer id) {
		if (id == null || id<=0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<User> finded = userRepository.findById(id);
		if (finded.isPresent()) {
			User user = finded.get();
			userRepository.deleteById(id);
			movieRepository.deleteUserMovies(user.getId());
		}else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}
}
