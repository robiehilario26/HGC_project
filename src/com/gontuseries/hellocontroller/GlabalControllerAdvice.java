package com.gontuseries.hellocontroller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlabalControllerAdvice {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		System.out.println("Unknown Exception found " + e);
		return "NullPointerException";

	}

	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {

		System.out.println("Unknow IO Exception found " + e);
		return "IOException";

	}

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		System.out.println("Unknow Exception found: " + e);
		return "Exception";
	}

}
