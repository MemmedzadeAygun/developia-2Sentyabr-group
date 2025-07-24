package az.developia.movie_service.response;

import java.util.List;

import az.developia.movie_service.entity.MovieEntity;
import az.developia.movie_service.repository.MovieRepository;
import lombok.Data;

@Data
public class MovieListResponse {

	private List<MovieEntity> movieResponse;
}
