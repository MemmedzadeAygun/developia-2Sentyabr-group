package az.developia.teacher;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import az.developia.teacher.entity.TeacherEntity;
import az.developia.teacher.entity.TeacherGroupEntity;
import az.developia.teacher.exception.MyRuntimeException;
import az.developia.teacher.repository.TeacherGroupRepository;
import az.developia.teacher.repository.TeacherRepository;

public class TeacherMain {
public static void main(String[] args) {
	
	TeacherEntity teacher=new TeacherEntity
			(0, "Elirahimmmm", "Elizade", "051", "nizami st.", "elirahim1", "1234");
	
	TeacherRepository repo=new TeacherRepository();
	System.out.println(repo.getById(5));
	
	TeacherGroupEntity teacherGroup=new TeacherGroupEntity(null, "a3",LocalDateTime.now(), 6);
	LocalDateTime.of(2025, 1, 29, 9, 04);
	
	
	TeacherGroupRepository groupRepo=new TeacherGroupRepository();
	groupRepo.addGroup(teacherGroup);
	groupRepo.deleteGroup(3);
//	System.out.println(groupRepo.getAll(6));
	
	
	try {
		String username=teacher.getUsername();
		String password=teacher.getPassword();
		
		if (repo.login("cahandar1", "1234")) {
			System.out.println("Login oldun!");
		}else {
			System.out.println("Istifadeci adi ve ya parol yalnisdir!");
		}
		
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
