package p2;

public class Main_3 {
public static void main(String[] args) throws InterruptedException {
	
	//main thread
		
		System.out.println("main basladi");
		
		OurThread thread=new OurThread();
		thread.start();
		Thread.sleep(1000);
	
		
		System.out.println("main basa catdi!");
		
	}

	
}
