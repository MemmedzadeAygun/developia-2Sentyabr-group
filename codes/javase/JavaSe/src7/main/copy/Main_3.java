package main.copy;

public class Main_3 {
	public static void main(String[] args) {
		
		ExceptionTest test = new ExceptionTest();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			System.out.println(test.checkArray(arr, 12));
			
		} catch (OurRuntimeException e) {
			System.out.println(e.getMyMessage());
		}
	}
}
