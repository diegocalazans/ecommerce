package br.com.estagio.ecommerce.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.estagio.ecommerce.core.exception.EcommerceException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({ EcommerceException.class })
	protected ResponseEntity<ExceptionResponse> badRequestException(Exception e){		
		ExceptionResponse error = new ExceptionResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage());
		return new ResponseEntity<ExceptionResponse>(error, null, HttpStatus.BAD_REQUEST.value());
	}

}
