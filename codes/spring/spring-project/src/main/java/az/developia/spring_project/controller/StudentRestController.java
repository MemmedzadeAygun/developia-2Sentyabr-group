package az.developia.spring_project.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project.dto.StudentDTO;
import az.developia.spring_project.entity.Students;
import az.developia.spring_project.entity.TeacherEntity;
import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.repository.AuthorityRepository;
import az.developia.spring_project.repository.StudentRepository;
import az.developia.spring_project.repository.TeacherRepository;
import az.developia.spring_project.repository.UserRepository;
import az.developia.spring_project.response.StudentResponse;

@RestController
@RequestMapping(path = "/students")
@CrossOrigin(origins = "*")
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepo;
	
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@GetMapping
//	@PreAuthorize(value = "hasAuthority('ROLE_GET_STUDENT')")
	public StudentResponse getAll(){
		StudentResponse studentResponse=new StudentResponse();
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TeacherEntity operatorTeacher=teacherRepository.findByUsername(username);
		Integer teacherId=operatorTeacher.getId();
		
		studentResponse.setStudents(studentRepo.findAllByTeacherId(teacherId));
		List<Students> list=studentRepo.findAllByTeacherId(teacherId);
//		List<Students> list=studentRepo.findAll();
		
		studentResponse.setStudents(list);
//		studentResponse.setUsername("Aygun");
		return studentResponse;
		
	}

	
	
	@PostMapping
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_STUDENT')")
	public void addStudent(@Valid @RequestBody StudentDTO student, BindingResult br)  {
		if (br.hasErrors()) {
			throw new MyRuntimeException(br,"melumatlarin tamligi pozulub");
		}
//		System.out.println(student);
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		TeacherEntity operatorTeacher=teacherRepository.findByUsername(username);
		Integer teacherId=operatorTeacher.getId();
		
//		if (student.getTeacherId()!=teacherId) {
//			throw new MyRuntimeException(null,"basqa muellime telebe qeydiyyat etmek olmaz!");
//		}
		
		Students students=new Students();
		students.setId(null);
		students.setName(student.getName());
		students.setSurname(student.getSurname());
		students.setBirthday(student.getBirthday());
//		students.setTeacherId(student.getTeacherId());
		students.setTeacherId(teacherId);		
		studentRepo.save(students);

	}

	@PutMapping
	@PreAuthorize(value = "hasAuthority('ROLE_UPDATE_STUDENT')")
	public void updateStudent(@Valid @RequestBody Students student, BindingResult br) {
		if (br.hasErrors()) {
			throw new MyRuntimeException(br,"melumatlarin tamligi pozulub");
		}
		if (student.getId()==null || student.getId()<=0) {
			throw new MyRuntimeException(null, "Id mutleqdir");
		}
		
		if (studentRepo.findById(student.getId()).isPresent()) {
			studentRepo.save(student);
		}else {
			throw new MyRuntimeException(null, "id tapilmadi");
		}
		
	}
	
	@DeleteMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_DELETE_STUDENT')")
	public void deleteStudent(@PathVariable Integer id) {
		String username=SecurityContextHolder.getContext().getAuthentication().getName();
		TeacherEntity operator=teacherRepository.findByUsername(username);
		if (operator==null) {
			throw new MyRuntimeException(null, "Muellim tapilmadi");
		}
		Integer teacherId=operator.getId();
		
		if(id==null || id<=0) {
			throw new MyRuntimeException(null, "id mutleqdir");
		}
		
		Optional<Students> finded = studentRepo.findById(id);
		
		if (finded.isPresent()) {
			Students en=finded.get();
			if (en.getTeacherId()==teacherId) {
				studentRepo.deleteById(id);
				userRepository.deleteById(en.getUsername());
				authorityRepository.deleteUserAuthorities(en.getUsername());
			}else {
				throw new MyRuntimeException(null, "oz telebeni sil");
			}
			
			
		}else {
			throw new MyRuntimeException(null, "id tapilmadi");
		}
		
	}
	
	@GetMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_STUDENT')")
	public Students getById(@PathVariable Integer id) {
		
		if (id==null || id==0) {
			throw new MyRuntimeException(null, "id mutleqdir");
		}
		
	    Optional<Students> o = studentRepo.findById(id);
		
		if (o.isPresent()) {
			return o.get();
		}else {
			throw new MyRuntimeException(null, "id tapilmadi");
		}
	}
}
