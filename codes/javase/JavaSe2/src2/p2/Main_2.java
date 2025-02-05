package p2;

public class Main_2 {
public static void main(String[] args) {
	
	String ikilik="010";
	Integer onluqIkilik=Integer.parseInt(ikilik, 2);
	System.out.println(onluqIkilik);
	
	String sekkizlk="25";
	Integer onluqSekkizlik=Integer.parseInt(sekkizlk, 8);
	System.out.println(onluqSekkizlik);
	
	String onaltiliq="123AB";
	int onluqOnaltiliq=Integer.parseInt(onaltiliq, 16);
	System.out.println(onluqOnaltiliq);
	
	String onluq1=Integer.toBinaryString(35);
	System.out.println(onluq1);
	
	String onluq2=Integer.toOctalString(78);
	System.out.println(onluq2);
	
	String onluq3=Integer.toHexString(89);
	System.out.println(onluq3);
}
}
