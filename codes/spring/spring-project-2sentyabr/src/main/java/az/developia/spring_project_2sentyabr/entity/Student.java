package az.developia.spring_project_2sentyabr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.validation.constraints.Size;


public class Student{
	
	private Integer id;
	
	@Size(min = 2,max=40,message="ad min 2, max 40 simvol ola biler")
//	[errormessage1]
	private String name;
	
	private String surname;
	

	public Student(Integer id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
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
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
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
