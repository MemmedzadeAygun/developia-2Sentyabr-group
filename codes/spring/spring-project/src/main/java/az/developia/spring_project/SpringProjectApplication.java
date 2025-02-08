package az.developia.spring_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext c=SpringApplication.run(SpringProjectApplication.class, args);
	}

}
