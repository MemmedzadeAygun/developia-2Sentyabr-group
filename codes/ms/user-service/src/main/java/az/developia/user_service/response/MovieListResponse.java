package az.developia.user_service.response;

import java.util.List;

import lombok.Data;

@Data
public class MovieListResponse {

	private List<MovieResponse> movieResponse;
}
