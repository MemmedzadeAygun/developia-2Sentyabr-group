package az.developia.spring_project_2sentyabr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_2sentyabr.dto.TeacherRequestDto;
import az.developia.spring_project_2sentyabr.entity.TeacherEntity;
import az.developia.spring_project_2sentyabr.entity.UserEntity;
import az.developia.spring_project_2sentyabr.repository.TeacherRepository;
import az.developia.spring_project_2sentyabr.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private UserRepository userRepository;

	@PostMapping(path = "/teacher")
	public void createTeacher(@RequestBody TeacherRequestDto d) {
		TeacherEntity t=new TeacherEntity();
		t.setId(null);
		t.setName(d.getName());
		t.setSurname(d.getSurname());
		t.setUsername(d.getUsername());
		teacherRepository.save(t);
		
		UserEntity u = new UserEntity();
		u.setUsername(d.getUsername());
		u.setPassword(d.getPassword());
		u.setEmail(d.getEmail());
		u.setEnabled(1);
		u.setType("teacher");
		userRepository.save(u);
	}
}
