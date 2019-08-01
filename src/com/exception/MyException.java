package com.exception;

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String getMessage() {
		System.out.println("getMessagegetMessage");
		System.out.println(super.getMessage());
		return super.getMessage();
	}


	@Override
	public synchronized Throwable getCause() {
		System.out.println("getCause  Throwable");
		System.out.println(super.getCause().toString()+"ll");
		
		return super.getCause();
	}

	@Override
	public void printStackTrace() {
		System.out.println("printStackTrace  void");
		
		super.printStackTrace();
	}
	
	
}
