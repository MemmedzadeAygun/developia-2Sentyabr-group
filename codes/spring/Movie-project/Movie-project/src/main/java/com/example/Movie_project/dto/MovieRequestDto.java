package com.example.Movie_project.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Movie Request Dto",description = "melumatlarin qebul eden dto")
public class MovieRequestDto {
	private Integer id;
	private String title;
	private String genre;
	private Integer rating;
	private Integer userId;
	
}
