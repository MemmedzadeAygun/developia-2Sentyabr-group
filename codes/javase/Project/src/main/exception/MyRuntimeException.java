package main.exception;

public class MyRuntimeException extends Exception {
	
	private String myMessage;

	public MyRuntimeException(String m) {
		myMessage=m;
	}
	
	public String getMyMessage() {
		return myMessage;
	}
}
