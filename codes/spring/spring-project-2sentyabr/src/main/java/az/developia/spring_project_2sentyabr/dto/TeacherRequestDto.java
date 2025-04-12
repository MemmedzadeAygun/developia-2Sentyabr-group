package az.developia.spring_project_2sentyabr.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class TeacherRequestDto {
	
	@Size(min = 2, max = 50, message = "Ad min 2 max 50 simvol ola biler")
	@NotEmpty
	private String name;
	
	@Size(min = 2, max = 50, message = "Soyad min 2 max 50 simvol ola biler")
	@NotBlank
	private String surname;
	
	@Pattern(regexp = "[a-zA-Z]+@[a-z]+\\.[a-z]{2,4}")
	private String email;
	
	private String username;
	private String password;
	
}
