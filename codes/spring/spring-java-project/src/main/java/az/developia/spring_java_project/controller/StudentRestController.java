package az.developia.spring_java_project.controller;


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

import az.developia.spring_java_project.exception.OurRuntimeException;
import az.developia.spring_java_project.other.Student;
import az.developia.spring_java_project.repository.StudentRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/students")
public class StudentRestController {
	
//	@Autowired
//	private DataSource datasource;
	
	@Autowired
	private StudentRepository repository;

	@GetMapping
	public List<String> showStudent(){
		List<String> students=new ArrayList<String>();
		students.add("Xedice");
		students.add("Nigar");
		students.add("Leman");
		return students;
	}
	
	@PostMapping(path = "/add")
	public void createStudent(@Valid @RequestBody Student s,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br);
		}
		
		System.out.println(s);
		
		repository.save(s);
		
//		try {
//			Connection conn=datasource.getConnection();
//			Statement st=conn.createStatement();
//			
//			String query="insert into students(name,surname) values('"+s.getName()+"','"+s.getSurname()+"')";
//			st.executeUpdate(query);
//			conn.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}
