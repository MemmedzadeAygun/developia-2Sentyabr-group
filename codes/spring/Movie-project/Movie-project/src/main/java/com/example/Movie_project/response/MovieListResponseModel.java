package com.example.Movie_project.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieListResponseModel {
	private List<MovieResponseModel> movieResponse;
}
