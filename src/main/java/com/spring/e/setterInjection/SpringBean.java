package com.spring.e.setterInjection;

public class SpringBean implements SpringInterface {

	private String message;
	
	public String getMessage() {
		return message;
	}
	/*Spring Setter Injection*/
	public void setMessage(String message) {
		this.message = message;
	}
	

	public void displayMessage() {
		System.out.println("Spring " + message);
	}
}
