package az.developia.spring_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/home")
public class HomeController {

	@GetMapping
	public String showHome() {
		return "home";
	}
	
	@GetMapping(path = "/students")
	//search?q=java
	public String showStudents(@RequestParam(name = "q",required = false,
	defaultValue = "") String q) {
		List<String> students=new ArrayList<String>();
		students.add("Aygun");
		students.add("Nigar");
		students.add("Neriman");
		students.add("Xelil");
		
		List<String> studentsFiltered=new ArrayList<String>();
		
		students.stream().forEach(student->{
			if (student.contains(q)) {
				studentsFiltered.add(student);
			}
		});
		System.out.println(studentsFiltered);
		
		return "students";
	}
	
	@GetMapping(path = "/kitablar")
	public String showBooks() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "books";
	}
}
