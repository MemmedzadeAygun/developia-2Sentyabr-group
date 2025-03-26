package az.developia.spring_java_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {

	private Integer id;
	private String name;
	private String surname;
	private String username;
	private String password;
	private String email;
}
