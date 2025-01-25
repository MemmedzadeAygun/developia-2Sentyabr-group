package az.developia.teacher;

import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.exception.MyRuntimeException;
import az.developia.teacher.repository.TeacherRepository;

public class TeacherMain {
public static void main(String[] args) {
	
	TeacherEntity teacher=new TeacherEntity
			(0, "Cahandar", "Murvetov", "055", "nizami st.", "cahandar4", "1234");
	
	TeacherRepository repo=new TeacherRepository();
	
	try {
		if (repo.checkUser(teacher.getUsername())) {
			System.out.println("Bu istifadeci artiq movcuddur");
		}
		else {
			repo.add(teacher);
		}
		
	} catch (MyRuntimeException e) {
		System.out.println(e.getMyMessage());
	}
}
}
