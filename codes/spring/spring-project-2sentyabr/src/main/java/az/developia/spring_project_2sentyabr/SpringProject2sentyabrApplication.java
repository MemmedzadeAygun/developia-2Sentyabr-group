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
		ConfigurableApplicationContext r = SpringApplication.run(SpringProject2sentyabrApplication.class, args);
		
		//bean
		Student bean =r.getBean("myStudent1", Student.class);
		
		Student bean2 =r.getBean("myStudent1", Student.class);
		
		
		System.out.println(bean.getComputer().getModel());
		System.out.println(bean.getName());
		
//		
//		String[] beanDefinitionNames = r.getBeanDefinitionNames();
//		for (String names : beanDefinitionNames) {
//			System.out.println(names);
//		}
	}

}
