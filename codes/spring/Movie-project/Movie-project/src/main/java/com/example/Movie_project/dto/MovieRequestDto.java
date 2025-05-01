package com.example.Movie_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequestDto {
	private Integer id;
	private String title;
	private String genre;
	private Integer rating;
	private Integer userId;
	
}
