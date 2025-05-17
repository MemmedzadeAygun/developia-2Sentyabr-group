package com.example.Movie_project.response;

import java.util.List;

import com.example.Movie_project.entity.Movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
private List<String> movies;

}
