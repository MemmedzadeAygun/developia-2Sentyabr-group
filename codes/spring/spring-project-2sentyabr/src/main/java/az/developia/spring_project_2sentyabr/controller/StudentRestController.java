package az.developia.spring_project_2sentyabr.controller;

import java.sql.Connection;
import java.sql.ResultSet;
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

import az.developia.spring_project_2sentyabr.entity.Student;
import az.developia.spring_project_2sentyabr.exception.OurRuntimeException;
import az.developia.spring_project_2sentyabr.repository.StudentRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/students")
public class StudentRestController {
	
//	@Autowired
//	private DataSource dataSource;
	
	@Autowired
	private StudentRepository studentRepository;
	

	@GetMapping
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(1,"Alirahim","Alizade"));
		students.add(new Student(2,"Elsad","Hemidov"));
		students.add(new Student(3,"Fexriyye","Alizade"));
		
//		try {
//			Connection connection=dataSource.getConnection();
//			Statement st=connection.createStatement();
//			String query="select * from students";
//			ResultSet executeQuery = st.executeQuery(query);
//			while (executeQuery.next()) {
//				Student s=new Student();
//				s.setId(executeQuery.getInt("id"));
//				s.setName(executeQuery.getString("name"));
//				s.setSurname(executeQuery.getString("surname"));
//				
//				students.add(s);
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		return students;
		
	}
	
	//ORM=>JPA=>Hibernate
	
	@PostMapping(path = "/add")
	public void addStudent(@Valid @RequestBody Student student,BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br);
		}
		System.out.println(student);
		
//		
//		try {
//			Connection connection=dataSource.getConnection();
//			Statement st=connection.createStatement();
//			String query="insert into students(name,surname) values('"+student.getName()+"','"+student.getSurname()+"')";
//			st.executeUpdate(query);
//			connection.close();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		studentRepository.save(student);
		
//		{1,"Aygun","Memmedzade"}
	}
}
