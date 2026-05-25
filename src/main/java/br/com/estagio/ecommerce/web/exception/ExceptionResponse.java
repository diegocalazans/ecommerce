package br.com.estagio.ecommerce.web.exception;

import br.com.estagio.ecommerce.core.util.DateUtil;

public class ExceptionResponse {
	
	private int error;
	private String message;
	private String timestamp;
	
	public ExceptionResponse() {
		
	}
		
	public ExceptionResponse(int error, String message) {
		super();
		this.error = error;
		this.message = message;
		this.timestamp = DateUtil.timestampErrorNow();
	}

	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
