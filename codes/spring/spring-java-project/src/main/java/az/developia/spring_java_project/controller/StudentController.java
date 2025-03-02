package az.developia.spring_java_project.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
//	@GetMapping(path = "/students")
//	public String showStudents(@RequestParam (name = "q") String q) {
//		List<String> students=new ArrayList<String>();
//		students.add("Aygun");
//		students.add("Nigar");
//		students.add("Celil");
//		
//		List<String> studentsFiltered=new ArrayList<String>();
//		for (String student : students) {
//			if (student.contains(q)) {
//				studentsFiltered.add(student);
//			}
//		}
//		System.out.println(studentsFiltered);
//		return "students";
//	}
	
	@GetMapping(path = "/students")
	public String showStudents(@RequestParam Map<String, String> params) {
		Map<String, String> students=new HashMap<String, String>();
		students.put("Aygun", "Memmedzade");
		students.put("Nigar", "Memmedova");
		students.put("Orxan", "Novruzov");
		
		String name=params.getOrDefault("name", "");
		String surname=params.getOrDefault("surname", "");
		
		List<String> studentsFiltered=new ArrayList<String>();
		for (Map.Entry<String, String> student : students.entrySet()) {
			if (student.getKey().equalsIgnoreCase(name) & student.getValue().equalsIgnoreCase(surname)) {
				studentsFiltered.add(name+" "+surname);
			}
		}
		
		System.out.println(studentsFiltered);
		return "students";
	}
}
