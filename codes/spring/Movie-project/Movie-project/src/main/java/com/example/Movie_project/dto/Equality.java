package com.example.Movie_project.dto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EqualityValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Equality {
	
	public String value() default "dram";
	public String message() default "Film dram janrinda olmalidir";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
