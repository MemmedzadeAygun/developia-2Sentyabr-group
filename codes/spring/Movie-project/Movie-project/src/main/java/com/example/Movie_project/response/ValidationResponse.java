package com.example.Movie_project.response;

import lombok.Data;

@Data
public class ValidationResponse {
	private String field;
	private String errorMessage;
}
