package com.example.Movie_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequestDto {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
}
