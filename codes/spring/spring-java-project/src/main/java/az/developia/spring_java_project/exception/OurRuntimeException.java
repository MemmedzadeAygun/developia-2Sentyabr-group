package az.developia.spring_java_project.exception;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException {

	BindingResult br;

	public OurRuntimeException(BindingResult br) {
		super();
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
}
