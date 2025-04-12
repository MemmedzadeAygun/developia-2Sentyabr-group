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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {
	private Integer id;
	
	@Size(min = 2, max = 50, message = "Ad min 2 max 50 simvol ola biler")
	@NotEmpty
	private String name;
	
	@Size(min = 2, max = 50, message = "Soyad min 2 max 50 simvol ola biler")
	@NotBlank
	private String surname;

	@NotNull(message = "Yas bos qoyula bilmez")
	@Min(value = 1,message = "Yas min 1 ola biler")
	@Max(value = 100,message = "Yas max 100 ola biler")
	private Integer age;
	
	@Past(message = "Kecmis zaman olmalidir")
	private LocalDate birthday;
	
	@Pattern(regexp = "[a-zA-Z]+@[a-z]+\\.[a-z]{2,4}")
	private String email;
	
	private String username;
	private String password;
	
}
