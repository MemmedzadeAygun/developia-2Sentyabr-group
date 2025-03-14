package az.developia.spring_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringProjectApplication {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper m=new ModelMapper();
		return m;
	}

	public static void main(String[] args) {
	 ConfigurableApplicationContext c=SpringApplication.run(SpringProjectApplication.class, args);
	}

}
