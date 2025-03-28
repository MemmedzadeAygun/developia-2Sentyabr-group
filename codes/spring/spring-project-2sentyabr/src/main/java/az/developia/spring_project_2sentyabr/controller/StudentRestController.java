package az.developia.spring_project_2sentyabr.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.repository.StudentRepository;
import az.developia.spring_project_2sentyabr.response.StudentResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/students")
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepository;
	

	@GetMapping
	public StudentResponse getStudents(){
		StudentResponse response=new StudentResponse();
		response.setStudents(studentRepository.findAll());
		response.setLength(1.50);
		return response;//bashqwhdg
		
	}
	
	@GetMapping(path = "/search")
	public List<Student> serach(@RequestParam(name = "query",required = false) String query){
		List<Student> all = studentRepository.findAll();
		if (query==null) {
			return all;
		}
		return all.stream().filter(student -> student.getName().toLowerCase().contains(query.toLowerCase()))
				.collect(Collectors.toList());
		
	}
	
	//ORM=>JPA=>Hibernate
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody Student student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"melumatlarin tamliginda problem var");
		}

		studentRepository.save(student);
		student.setId(null);
		
//		{1,"Aygun","Memmedzade"}
	}
	
	
	//null,0,found,not found
	@PutMapping(path = "/update")
	public void update(@Valid @RequestBody Student student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"melumatlarin tamliginda problem var");
		}
		
		if (student.getId()==null || student.getId()<=0) {
			throw new OurRuntimeException(null,"id mutleqdir");
		}

		if (studentRepository.findById(student.getId()).isPresent()) {
			studentRepository.save(student);
		}else {
			throw new OurRuntimeException(null,"id tapilmadi");
		}
		
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		//null, 0, not found, found
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			studentRepository.deleteById(id);
		}else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
		
		return ResponseEntity.ok("Stdudent delete successfully");
	}
	
	
	@GetMapping(path = "/{id}")
	public Student getById(@PathVariable Integer id) {
		if (id==null || id<=0) {
			throw new OurRuntimeException(null, "id mutleqdir");
		}
		Optional<Student> byId = studentRepository.findById(id);
		if (byId.isPresent()) {
			return byId.get();
		}else {
			throw new OurRuntimeException(null, "id tapilmadi");
		}
	}
}
