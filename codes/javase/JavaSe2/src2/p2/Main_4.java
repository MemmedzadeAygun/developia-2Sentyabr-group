package p2;

import java.time.LocalDate;

public class Main_4 {
public static void main(String[] args) {
	
	LocalDate l1=LocalDate.now();	//immutable mutable
	System.out.println(l1);
	
	LocalDate l2=LocalDate.of(2024, 1, 28);
	System.out.println(l2);
	System.out.println(l2.equals(l1));
	
	System.out.println(l2.isBefore(l1));
	
	LocalDate l3=l1.plusMonths(1);
	System.out.println(l3);
	System.out.println(l1);
	
}
}
