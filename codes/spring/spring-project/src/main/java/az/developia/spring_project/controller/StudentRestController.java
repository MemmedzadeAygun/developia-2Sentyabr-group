package az.developia.spring_project.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.repository.StudentRepository;
import az.developia.spring_project.response.StudentResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/students")
public class StudentRestController {
	
//	@Autowired
//	private DataSource dataSource;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping
	public StudentResponse getAll(){
		StudentResponse studentResponse=new StudentResponse();
		studentResponse.setStudents(studentRepo.findAll());
		studentResponse.setUsername("Aygun");
		return studentResponse;
		
	}

//	@GetMapping
//	public List<String> getStudents(){
//		List<String> students=new ArrayList<String>();
//		students.add("Aygun");
//		students.add("Gunay");
//		students.add("Nigar");
//		students.add("Nicat");
//		return students;
//	}
	
	
	@PostMapping
	public void addStudent(@Valid @RequestBody StudentDTO student, BindingResult br)  {
		if (br.hasErrors()) {
			throw new MyRuntimeException(br,"melumatlarin tamligi pozulub");
		}
//		System.out.println(student);
		
		Students students=new Students();
		students.setId(null);
		students.setName(student.getName());
		students.setSurname(student.getSurname());
		
		studentRepo.save(students);
		
		
//		try {
//			Connection conn=dataSource.getConnection();
//			Statement st=conn.createStatement();
//			st.executeUpdate("insert into students (name, surname) values ('"+student.getName()+"','"+student.getSurname()+"')");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}

	@PutMapping
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
	public void deleteStudent(@PathVariable Integer id) {
		
		if(id==null || id<=0) {
			throw new MyRuntimeException(null, "Id mutleqdir");
		}
		
		if (studentRepo.findById(id).isPresent()) {
			studentRepo.deleteById(id);
		}else {
			throw new MyRuntimeException(null, "id tapilmadi");
		}
		
	}
	
	@GetMapping(path = "/{id}")
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
