package demo;

public class OutOfRangeValueException extends RuntimeException {

	private String bizimMesaj;

	public OutOfRangeValueException(String bizimMesaj) {
		this.bizimMesaj = bizimMesaj;
	}
	
	public String getBizimMesaj() {
		return bizimMesaj;
	}
}
