package com.example.Movie_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieProjectApplication {
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper m = new ModelMapper();
		return m;
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieProjectApplication.class, args);
	}

}
