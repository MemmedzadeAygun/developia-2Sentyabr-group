package main;

public class Main14 {
	public static void main(String[] args) {
		
		doIt(a -> {
			System.out.println("Istifadeci bloklandi " + a);
		});
	}
	
	public static void doIt(Blockable b) {
		b.block("Aygun");
	}
}
