package az.developia.spring_project_2sentyabr.response;

import java.util.List;

import az.developia.spring_project_2sentyabr.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
private List<Student> students;
private Double length;

}
