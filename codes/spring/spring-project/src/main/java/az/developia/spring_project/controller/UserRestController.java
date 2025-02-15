package az.developia.spring_project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project.dto.TeacherDTO;
import az.developia.spring_project.entity.TeacherEntity;
import az.developia.spring_project.entity.UserEntity;
import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.repository.TeacherRepository;
import az.developia.spring_project.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/teacher")
	public void createTeacher(@RequestBody TeacherDTO teacher) {
		
		Optional<UserEntity> findUser = userRepository.findById(teacher.getUsername());
		if (findUser.isPresent()) {
			throw new MyRuntimeException(null, "Bu istifadeci artqi movcuddur!");
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
		u.setEmail(teacher.getEmail());
		u.setEnabled(1);
		u.setType("teacher");
		userRepository.save(u);
	}
	
	@GetMapping(path = "/login")
	public void login() {
		
	}
}
