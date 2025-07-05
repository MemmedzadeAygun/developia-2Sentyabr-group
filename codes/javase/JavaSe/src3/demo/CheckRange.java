package demo;

public class CheckRange {

	public void checkValueRange(int value) {
		int min = 10;
		int max = 100;

		if (value < min || value > max) {
			throw new OutOfRangeValueException("Daxil etdiyiniz deyer verdiyiniz araliqda deyil");
		} else {
			System.out.println("Deyer verilen araliqdadir");
		}
	}
}
