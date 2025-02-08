package az.developia.spring_java_project.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Scope(value = "prototype")
@Component(value = "myStudent1")
public class Student {
	private Integer Id;
	private String name;
	@Autowired
	@Qualifier(value = "myComp2")
	private Computer computer;
	
	public Student() {
		System.out.println("Student object created");
		this.Id=1;
		this.name="Nigar";
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
}
