package main;

public class Extra {

//	{12,3,4,565} 6

	public int giveArrayElement(int[] array, int index) throws BizmkilerException {
		int result = 0;
		if (index >= array.length) {
			throw new BizmkilerException("Olamayan elemente muraciet etdiniz");
		}
		result = array[index];

//		try {
//			result=array[index];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}

		return result;
	}
}
