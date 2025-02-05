package demo;

import java.util.ArrayList;

public class Main2_1 {
public static void main(String[] args) {
	
	
	Students s1=new Students("Ali",23);
	Students s2=new Students("Ehmed",20);
	Students s3=new Students("Xedice",24);
	Students s4=new Students("Nermin",23);
	
	ArrayList<Students> student=new ArrayList<Students>();
	
	Students[] students= {s1,s2,s3,s3};
	
	for (int i = 0; i < 4; i++) {
		student.add(students[i]);
	}
//	for (Students s : students) {
//		student.add(s);
//	}
	for (Students students2 : student) {
		System.out.println(students2);
	}
	
//	for (Students students : student) {
//		System.out.println(students);
//	}
}
}
