package br.com.estagio.ecommerce.core.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	
	public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
	
	private DateUtil() {
		
	}
	
	public static String timestampErrorNow() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern(TIMESTAMP_FORMAT));
	}	
}
