package com.example.Movie_project.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponseDto {
	private Integer Id;
	private String title;
	private String genre;
	private Integer rating;
}
