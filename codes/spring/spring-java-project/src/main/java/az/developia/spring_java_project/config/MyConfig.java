package az.developia.spring_java_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import az.developia.spring_java_project.other.Computer;
import az.developia.spring_java_project.other.Student;

@Configuration
public class MyConfig {

//	@Bean
	public Student myStudent2() {
		Student s=new Student();
		s.setId(12);
		s.setName("Aygun");
		return s;
	}
	
	@Bean
	public Computer myComp2() {
		Computer c=new Computer();
		c.setId(34);
		c.setModel("g65");
		return c;
	}
}
