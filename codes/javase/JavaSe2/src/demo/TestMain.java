package demo;

public class TestMain {
public static void main(String[] args) {
	
	int[] array=new int[] {12,3,4,6};
	int result=calculate(array);
	System.out.println(result);
	
	System.out.println("maxElement: "+maxElement(array));
	
 }

	public static int calculate(int[] arr) {
		int sum=0;
		
		for (int num : arr) {
			if (num%2==0) {
				sum+=num;
			}
		}
		return sum*2;
	}
	
	public static int maxElement(int[] arr) {
		int maxElement=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[1]>maxElement) {
				maxElement=arr[1];
			}
		}
		
		return maxElement;
	}

}
