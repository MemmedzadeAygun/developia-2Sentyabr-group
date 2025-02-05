package p3;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main_3 {
public static void main(String[] args) {
	//LocalDate i date tipine cevirmek
	
	LocalDate l1=LocalDate.now();
	LocalDate l2=LocalDate.of(0, 0, 0);
	System.out.println(l1);
	
	Date d=Date.valueOf(l1);
	
	//Date -i localdate cevirmek
	System.out.println(d.toLocalDate());
	
	
	//Localdate i timestamp e cevirmek
	
	Timestamp.valueOf(LocalDateTime.now());
	
	
	//timestamp i localdate cevirmek
	Timestamp.valueOf(LocalDateTime.now()).toLocalDateTime();
}
}
