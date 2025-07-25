package com.example.Movie_project.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Movie_project.dto.AuthRequestDto;
import com.example.Movie_project.entity.Authorities;
import com.example.Movie_project.entity.User;
import com.example.Movie_project.exception.InvalidCredentialsException;
import com.example.Movie_project.exception.OurRuntimeException;
import com.example.Movie_project.repository.AuthorityRepository;
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
	private final AuthorityRepository authorityRepository;
	private final JwtUtil jwtUtil;
	
	@Autowired
	private ModelMapper modelMapper;

	public String create(AuthRequestDto dto) {
		Optional<User> byUsername = userRepository.findByUsername(dto.getUsername());
		if (byUsername.isPresent()) {
			throw new OurRuntimeException(null, "Username is exists");
		}

		String encode = passwordEncoder.encode(dto.getPassword());
		User user = new User();
		modelMapper.map(dto, user);
		user.setPassword(encode);
		userRepository.save(user);
		
		Authorities a1=new Authorities();
		a1.setUsername(user.getUsername());
		a1.setAuthority("ROLE_ADD_MOVIE");
		authorityRepository.save(a1);

		return "User create successfully";

	}

	public String login(AuthRequestDto dto) {
		Optional<User> user = userRepository.findByUsername(dto.getUsername());

		if (!user.isPresent() || !passwordEncoder.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or pasword incorrect");
		}
		
		List<String> authorityList =  authorityRepository.findByUsername(user.get().getUsername()).stream()
				.map(Authorities :: getAuthority)
				.collect(Collectors.toList());
				
		return jwtUtil.generateToken(user.get().getUsername(),user.get().getFirstName(),user.get().getLastName(),user.get().getEmail(),authorityList);
	}

	public ResponseEntity<Map<String, Object>> getUserDetail(String token) {
		if (token.startsWith("Bearer")) {
			token=token.substring(7);
		}
		Map<String, Object> claims = jwtUtil.extractClaims(token);
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
