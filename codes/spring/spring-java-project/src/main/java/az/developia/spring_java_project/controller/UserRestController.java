package az.developia.spring_java_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_java_project.dto.TeacherDto;
import az.developia.spring_java_project.exception.OurRuntimeException;
import az.developia.spring_java_project.other.AuthorityEntity;
import az.developia.spring_java_project.other.TeacherEntity;
import az.developia.spring_java_project.other.UserEntity;
import az.developia.spring_java_project.repository.AuthorityRepository;
import az.developia.spring_java_project.repository.TeacherRepository;
import az.developia.spring_java_project.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;

	@PostMapping(path = "/teacher")
	public void createTeacher(@RequestBody TeacherDto teacher) {
		
		Optional<UserEntity> byId = userRepository.findById(teacher.getUsername());
		if (byId.isPresent()) {
			throw new OurRuntimeException(null,"Bu username artiq movcuddur");
		}
		
		TeacherEntity t=new TeacherEntity();
		t.setId(teacher.getId());
		t.setName(teacher.getName());
		t.setSurname(teacher.getSurname());
		t.setUsername(teacher.getUsername());
		teacherRepository.save(t);
		
		UserEntity u=new UserEntity();
		u.setUsername(teacher.getUsername());
		u.setPassword(teacher.getPassword());
		u.setEnabled(1);
		u.setEmail(teacher.getEmail());
		u.setType("teacher");
		userRepository.save(u);
		
		AuthorityEntity a1=new AuthorityEntity();
		a1.setUsername(u.getUsername());
		a1.setAuthority("ROLE_ADD_STUDENT");
		authorityRepository.save(a1);
	}
	
	@GetMapping(path = "/login")
	public void login() {
		
	}
}
