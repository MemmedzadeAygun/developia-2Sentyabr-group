package az.developia.spring_project_2sentyabr.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidationResponse {
	private String field;
	private String errorMessage;

}
