package p3;

public class Main_5 {
public static void main(String[] args) throws InterruptedException {
	//main thread WEB
	System.out.println("main basladi");
	
	MyThread myThread=new MyThread();
	myThread.start();
	myThread.sleep(1000);
	
	System.out.println("main bitdi");
	
}

}
