package az.developia.spring_project.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_project.exception.MyRuntimeException;

@RestControllerAdvice
public class ExceptionHandlers {

	@ExceptionHandler
	public String handle(MyRuntimeException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
	
}
