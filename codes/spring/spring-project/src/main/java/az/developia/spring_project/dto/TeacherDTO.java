package az.developia.spring_project.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

	@Min(value = 0,message = "menfi olmaz")
	private Integer id;

	@Size(min = 2, max = 40, message = "Ad min 2, max 40 simvol ola biler")
	private String name;

	@Size(min = 2, max = 40, message = "Soyad min 2, max 40 simvol ola biler")
	private String surname;

	@Size(min = 2, max = 40, message = "Username min 2, max 40 simvol ola biler")
	private String username;

	@Size(min = 2, max = 40, message = "Password min 2, max 40 simvol ola biler")
	private String password;
	
	@Pattern(regexp = "[a-z]+@[a-z]+\\.[a-z]{2,4}",message = "emaili duz yaz!!")
	private String email;
}
