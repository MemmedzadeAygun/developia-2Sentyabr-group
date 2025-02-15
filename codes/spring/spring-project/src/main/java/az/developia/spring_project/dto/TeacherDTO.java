package az.developia.spring_project.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
