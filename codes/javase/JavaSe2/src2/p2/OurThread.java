package p2;

public class OurThread  extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			doIt();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void doIt() {
		System.out.println("do it");
	}
}
