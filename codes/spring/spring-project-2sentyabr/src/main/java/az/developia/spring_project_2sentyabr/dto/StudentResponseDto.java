package az.developia.spring_project_2sentyabr.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponseDto {
	private Integer id;

	private String name;
	private String surname;
}
