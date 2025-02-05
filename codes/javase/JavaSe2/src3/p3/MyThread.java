package p3;

public class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			doIt();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void doIt() {
		System.out.println("do it");
	}
}
