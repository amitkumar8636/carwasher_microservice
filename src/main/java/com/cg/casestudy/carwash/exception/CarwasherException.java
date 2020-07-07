package com.cg.casestudy.carwash.exception;

public class CarwasherException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarwasherException() {
		super();
	}

	public CarwasherException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CarwasherException(String message, Throwable cause) {
		super(message, cause);
	}

	public CarwasherException(String message) {
		super(message);
	}

	



}
