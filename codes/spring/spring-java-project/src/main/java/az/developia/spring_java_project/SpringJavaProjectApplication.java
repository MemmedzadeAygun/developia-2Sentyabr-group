package az.developia.spring_java_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_java_project.other.Student;


@SpringBootApplication
//component scan
//auto config
//configuration
public class SpringJavaProjectApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext run= SpringApplication.run(SpringJavaProjectApplication.class, args);

	Student studentBean= run.getBean("myStudent1", Student.class);
	
	Student studentBean2= run.getBean("myStudent1", Student.class);
	
	System.out.println(studentBean.getName());
	
//	System.out.println(studentBean.getComputer().getModel());
	 
//	 String[] beanNames = run.getBeanDefinitionNames();
//	 
//	 for (String beanName : beanNames) {
//		System.out.println(beanName);
//	}
	}

}
