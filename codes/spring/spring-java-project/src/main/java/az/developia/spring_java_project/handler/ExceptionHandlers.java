package az.developia.spring_java_project.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_java_project.exception.OurRuntimeException;

@RestControllerAdvice
public class ExceptionHandlers {

	@ExceptionHandler
	public String handler(OurRuntimeException exc) {

		BindingResult br = exc.getBr();
		if (br==null) {
			
		}else {
			
		}
		return exc.getMessage();
	}
}
