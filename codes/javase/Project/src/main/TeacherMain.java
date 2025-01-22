package main;

import java.time.LocalDateTime;

import main.entity.TeacherEntity;
import main.entity.TeacherGroupEntity;
import main.exception.MyRuntimeException;
import main.repo.TeacherGroupRepository;
import main.repo.TeacherRepository;

public class TeacherMain {
public static void main(String[] args) {
	
	TeacherEntity teacher=new TeacherEntity
			(null, "Aygun", "Memmedzade", "050", "aygun1", "1234");
	
	TeacherRepository repo=new TeacherRepository();
	try {
		String username=teacher.getUsername();
		String password=teacher.getPassword();
		
		if (repo.login(username, password)) {
			System.out.println("Login oldunuz!");
		}
		else {
			System.out.println("Istifadeci adi ve ya parol yalnisdir!");
		}
		if (repo.checkUsername(teacher.getUsername())) {
			System.out.println("bu username artiq movcuddur");
		}
		else {
			repo.add(teacher);
		}
		
	} catch (MyRuntimeException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println(e.getMyMessage());
	}
	
	System.out.println(repo.getById(1));
	
//	TeacherGroupEntity teacherGroup=new TeacherGroupEntity(null,"c1",LocalDateTime.now(),1);
//	
//	TeacherGroupRepository groupRepo=new TeacherGroupRepository();
//	groupRepo.add(teacherGroup);
//	System.out.println(groupRepo.findGroupByTeacherId(1));
//	groupRepo.deleteById(12);
}
}
