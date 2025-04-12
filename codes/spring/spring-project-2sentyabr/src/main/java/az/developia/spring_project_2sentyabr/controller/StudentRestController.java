package az.developia.spring_project_2sentyabr.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.apache.catalina.User;
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

import az.developia.spring_project_2sentyabr.dto.StudentRequestDto;
import az.developia.spring_project_2sentyabr.dto.StudentResponseDto;
import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.repository.StudentRepository;
import az.developia.spring_project_2sentyabr.response.StudentResponse;
import az.developia.spring_project_2sentyabr.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/students")
@RequiredArgsConstructor
public class StudentRestController {
	
	private final StudentService studentService;

	@GetMapping
	public StudentResponse getStudents(){
		return studentService.getStudents();//bashqwhdg
		
	}
	
	@GetMapping(path = "/search")
	public List<Student> serach(@RequestParam(name = "query",required = false) String query){
		return studentService.search(query);
		
	}
	
	//ORM=>JPA=>Hibernate
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody StudentRequestDto dto,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"melumatlarin tamliginda problem var");
		}
		studentService.create(dto);
		
//		{1,"Aygun","Memmedzade"}
	}
	
	
	//null,0,found,not found
	@PutMapping(path = "/update")
	public void update(@Valid @RequestBody StudentRequestDto dto,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br,"melumatlarin tamliginda problem var");
		}
		
		studentService.update(dto);
		
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
		studentService.delete(id);
		return ResponseEntity.ok("Stdudent delete successfully");
	}
	
	
	@GetMapping(path = "/{id}")
	public StudentResponseDto getById(@PathVariable Integer id) {
		
		return studentService.getById(id);
	}
}
