package az.developia.spring_project_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component(value = "myStudent1")
//@Scope(value = "prototype")
public class Student{
	
	private Integer id;
	private String name;
	private String surname;
	@Autowired
	@Qualifier(value = "myComp1")
	private Computer computer;
	
	public Student() {
		System.out.println("Student object created");
		this.id=1;
		this.name="Xedice";
		this.surname="Memmedov";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", computer=" + computer + "]";
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
