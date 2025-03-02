package az.developia.spring_project_2sentyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_2sentyabr.entity.Student;

@RestController
@RequestMapping(path = "/api/students")
public class StudentRestController {

	@GetMapping
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<Student>();
		students.add(new Student(1,"Alirahim","Alizade"));
		students.add(new Student(2,"Elsad","Hemidov"));
		students.add(new Student(3,"Fexriyye","Alizade"));
		return students;
	}
	
	@PostMapping(path = "/add")
	public void addStudent(@RequestBody Student student) {
		System.out.println(student);
//		{1,"Aygun","Memmedzade"}
	}
}
