package az.developia.spring_project.exception;

import org.springframework.validation.BindingResult;

public class MyRuntimeException extends RuntimeException {

	private BindingResult br;

	public MyRuntimeException(BindingResult br) {
		super();
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
}
