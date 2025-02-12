package az.developia.spring_project.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_project.exception.MyRuntimeException;
import az.developia.spring_project.response.ExceptionResponse;
import az.developia.spring_project.response.ValidationResponse;

@RestControllerAdvice
public class ExceptionHandlers {

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handle(MyRuntimeException exc) {
		
		ExceptionResponse response=new ExceptionResponse();
		
		BindingResult br = exc.getBr();
		
		if (exc.getBr()==null) {
			
		}
		else {
			List<FieldError> fieldErrors=br.getFieldErrors();
			List<ValidationResponse> validations=new ArrayList<ValidationResponse>();
			
			for (FieldError fieldError : fieldErrors) {
				ValidationResponse validation=new ValidationResponse();
				validation.setField(fieldError.getField());
				validation.setMessage(fieldError.getDefaultMessage());
				validations.add(validation);
			}
			
			response.setValidations(validations);
		}
		
		
		response.setMessage(exc.getMessage());
		
		return response;
		
//		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
	
}
