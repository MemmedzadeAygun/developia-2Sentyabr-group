package main;

public class BizmkilerException extends RuntimeException{

	private String bizimMesaj;

	public BizmkilerException(String m) {
		this.bizimMesaj = m;
	}
	
	public String getBizimMesaj() {
		return bizimMesaj;
	}
	
	
	//CustomException
	//Operations
	//MainClass
	
}
