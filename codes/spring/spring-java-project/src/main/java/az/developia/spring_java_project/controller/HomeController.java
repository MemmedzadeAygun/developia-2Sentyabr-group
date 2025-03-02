package az.developia.spring_java_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.developia.spring_java_project.other.Book;



@Controller
@RequestMapping(path = "/home")
public class HomeController {
	
	@GetMapping
	public String showHome() {
		return "home";
	}
	
//	@GetMapping(path = "/students")
//	public String showStudents() {
//		return "students";
//	}
	
	@GetMapping(path = "/kitablar")
	public String showBooks(Model model) {
		List<Book> books=new ArrayList<Book>();
		books.add(new Book("Cinayet ve Ceza","Fyodor Dostoyevski"));
		books.add(new Book("Sefiller","Vuctor Huqo"));
		
		model.addAttribute("books", books);
		return "books";
	}
}
