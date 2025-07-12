package main.copy;

public class OurRuntimeException extends RuntimeException{

	private String myMessage;
	
	public OurRuntimeException(String m) {
		this.myMessage = m;
	}
	
	public String getMyMessage() {
		return myMessage;
	}
}
