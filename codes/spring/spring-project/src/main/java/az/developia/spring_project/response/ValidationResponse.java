package az.developia.spring_project.response;

import java.util.List;

import az.developia.spring_project.entity.Students;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationResponse {
	private String message;
	private String field;
}
