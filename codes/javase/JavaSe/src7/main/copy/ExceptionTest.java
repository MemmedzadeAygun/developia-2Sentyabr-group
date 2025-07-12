package main.copy;

public class ExceptionTest {

	public Integer checkArray(int[] array,int index) {
		if (index >= array.length) {
			throw new OurRuntimeException("index is wrong");
		}
		
		int result = 0;
		result = array[index];
		return result;
	}
}
