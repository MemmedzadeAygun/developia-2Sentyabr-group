package az.developia.user_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import az.developia.user_service.entity.UserEntity;
import az.developia.user_service.repository.UserRepository;
import az.developia.user_service.response.MovieListResponse;
import az.developia.user_service.response.UserListResponse;
import az.developia.user_service.response.UserResponse;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/getAll")
	public UserListResponse getUser() {
		UserListResponse resp = new UserListResponse();
		
		List<UserEntity> users = userRepository.findAll();
		
		resp.setUserResponse(users);
		
		return resp;
	}
	
	@GetMapping(path = "/width-movies")
	public UserListResponse getUserWithMovies() {
		UserListResponse resp = new UserListResponse();
		
		RestTemplate rest = new RestTemplate();
		
		List<UserEntity> users = userRepository.findAll();
		
		
		List<UserResponse> userWithMovies = new ArrayList<UserResponse>();
		
		for (UserEntity userEntity : users) {
			UserResponse response = new UserResponse();
			response.setId(userEntity.getId());
			response.setFirstName(userEntity.getFirstName());
			response.setLastName(userEntity.getLastName());
			
			MovieListResponse movieResp = rest.getForObject("http://localhost:8001/movies/user/" + userEntity.getId(), MovieListResponse.class);
			
			response.setMovies(movieResp.getMovieResponse());
			
			userWithMovies.add(response);
		}
		
//		resp.setUserResponse(users);
		resp.setUserwitdhMovies(userWithMovies);
		
		return resp;
	}
	
	
}
