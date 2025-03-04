package az.developia.spring_project.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project.dto.StudentDTO;
import az.developia.spring_project.dto.TeacherDTO;
import az.developia.spring_project.entity.AuthorityEntity;
import az.developia.spring_project.entity.Students;
import az.developia.spring_project.entity.TeacherEntity;
import az.developia.spring_project.entity.UserEntity;
import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.repository.AuthorityRepository;
import az.developia.spring_project.repository.StudentRepository;
import az.developia.spring_project.repository.TeacherRepository;
import az.developia.spring_project.repository.UserRepository;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserRestController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;

	@PostMapping(path = "/teacher")
	public void createTeacher(@RequestBody TeacherDTO teacher) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
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
		
		String raw = teacher.getPassword();
		String password="{bcrypt}"+encoder.encode(raw);
		u.setPassword(password);
		u.setEmail(teacher.getEmail());
		u.setEnabled(1);
		u.setType("teacher");
		userRepository.save(u);
		
		AuthorityEntity a1=new AuthorityEntity();
		a1.setUsername(u.getUsername());
		a1.setAuthority("ROLE_ADD_STUDENT");
		authorityRepository.save(a1);	
	}
	
	@PostMapping(path = "/student")
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_STUDENT')")
	public void createStudent(@Valid @RequestBody StudentDTO student, BindingResult br) {
		if (br.hasErrors()) {
			throw new MyRuntimeException(br,"melumatlarin tamligi pozulub");
		}
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		
		Optional<UserEntity> findUser = userRepository.findById(student.getUsername());
		if (findUser.isPresent()) {
			throw new MyRuntimeException(null, "Bu istifadeci artqi movcuddur!");
		}
		
		Students s=new Students();
		s.setName(student.getName());
		s.setSurname(student.getSurname());
		s.setUsername(student.getUsername());
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TeacherEntity operatorTeacher=teacherRepository.findByUsername(username);
		Integer teacherId=operatorTeacher.getId();
		
		s.setTeacherId(teacherId);
		studentRepository.save(s);
		
		UserEntity u=new UserEntity();
		u.setUsername(student.getUsername());
		
		String raw = student.getPassword();
		String password="{bcrypt}"+encoder.encode(raw);
		u.setPassword(password);
		u.setEmail(student.getEmail());
		u.setEnabled(1);
		u.setType("student");
		userRepository.save(u);
		
		AuthorityEntity a1=new AuthorityEntity();
		a1.setUsername(u.getUsername());
		a1.setAuthority("ROLE_UPDATE_STUDENT");
		authorityRepository.save(a1);	
	}
	
	@GetMapping(path = "/login")
	public void login() {
		
	}
}
