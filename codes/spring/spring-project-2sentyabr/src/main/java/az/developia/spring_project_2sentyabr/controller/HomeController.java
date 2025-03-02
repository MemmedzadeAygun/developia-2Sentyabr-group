package az.developia.spring_project_2sentyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.developia.spring_project_2sentyabr.entity.Book;

@Controller
@RequestMapping(path = "/home")
public class HomeController {
	
	@GetMapping
	public String showHome() {
		return "home";  //localhost:8084/kitablar
	}

	//localhost:8084/kitablar
	@GetMapping(path = "/kitablar")
	public String showBooks(Model model) {
		List<Book> books=new ArrayList<Book>();
		books.add(new Book("Cinayet ve Ceza","Fyodor Dosteyevski"));
		books.add(new Book("Cinayet ve Ceza","Fyodor Dosteyevski"));
		model.addAttribute("books", books);
		return "books";
	}
}
