package p3;

public class Main_4 {
public static void main(String[] args) {
	//Say sistemleri
	//2 01
	//8 01234567
	//10 0123456789
	//16 0123456789ABCDEF
	
	//Ilikden onluga kecid
	String ikilik="101";
	int ikilikOnluq=Integer.parseInt(ikilik, 2);
	System.out.println(ikilikOnluq);
	
	//Sekkizlekden 10 luga kecid
	String sekkizlik="127";
	int sekkizlikonluq=Integer.parseInt(sekkizlik, 8);
	System.out.println(sekkizlikonluq);
	
	//ikilikden 10luga kecid
	String onluq1=Integer.toBinaryString(5);
	System.out.println(onluq1);
	
	String onluq2=Integer.toOctalString(87);
	System.out.println(onluq2);
	
	
}
}
