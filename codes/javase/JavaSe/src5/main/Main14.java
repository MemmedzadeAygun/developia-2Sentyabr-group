package main;

public class Main14 {
	public static void main(String[] args) {
		
//		Blockable b= new Blockable() {
//			
//			@Override
//			public void block(String user) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
		doIt(a -> {
			System.out.println("Istifadeci bloklandi " + a);
		});
	}
	
	public static void doIt(Blockable b) {
		b.block("Aygun");
	}
}
