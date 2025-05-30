package com.example.Movie_project.dto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EqualityValidator implements ConstraintValidator<Equality, String> {
	
	private String otherData;
	
	@Override
	public void initialize(Equality data) {
		this.otherData = data.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if (value != null) {
			result = value.equals(otherData);
		}else {
			return false;
		}
		return result;
	}

}
