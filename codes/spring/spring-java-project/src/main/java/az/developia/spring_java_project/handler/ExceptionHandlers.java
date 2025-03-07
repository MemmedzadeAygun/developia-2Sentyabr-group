package az.developia.spring_java_project.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_java_project.exception.OurRuntimeException;

@RestControllerAdvice
public class ExceptionHandlers {

	@ExceptionHandler
	public List<String> handler(OurRuntimeException exc) {
//		return exc.getBr().getFieldErrors().get(0).getField();
		List<FieldError> fieldErrors=exc.getBr().getFieldErrors();
		List<String> errorMessages=new ArrayList<String>();
		for (FieldError fieldError : fieldErrors) {
			errorMessages.add(fieldError.getDefaultMessage());
		}
		return errorMessages;
	}
}
