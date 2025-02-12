package az.developia.spring_project_2sentyabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project_2sentyabr.entity.Student;


@SpringBootApplication
public class SpringProject2sentyabrApplication {
	
	//auto config
	//component scan
	//config

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringProject2sentyabrApplication.class, args);
		
		//bean
		Student bean = run.getBean(Student.class);
		System.out.println(bean.getName());

		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String names : beanDefinitionNames) {
			System.out.println(names);
		}
	}

}
