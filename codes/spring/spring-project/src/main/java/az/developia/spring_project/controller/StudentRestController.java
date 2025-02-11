package az.developia.spring_project.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project.entity.Students;
import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.repository.StudentRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/students")
public class StudentRestController {
	
//	@Autowired
//	private DataSource dataSource;
	
	@Autowired
	private StudentRepository studentRepo;

	@GetMapping
	public List<String> getStudents(){
		List<String> students=new ArrayList<String>();
		students.add("Aygun");
		students.add("Gunay");
		students.add("Nigar");
		students.add("Nicat");
		return students;
	}
	
	
	@PostMapping
	public void addStudent(@Valid @RequestBody Students student, BindingResult br)  {
		if (br.hasErrors()) {
			throw new MyRuntimeException(br);
		}
		System.out.println(student);
		studentRepo.save(student);
		
		
//		try {
//			Connection conn=dataSource.getConnection();
//			Statement st=conn.createStatement();
//			st.executeUpdate("insert into students (name, surname) values ('"+student.getName()+"','"+student.getSurname()+"')");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}
