package demo;

public class MainClass {
	public static void main(String[] args) {

		CheckRange check = new CheckRange();
		try {
			check.checkValueRange(9);
		} catch (OutOfRangeValueException e) {
			System.out.println(e.getBizimMesaj());
		}

	}
}
