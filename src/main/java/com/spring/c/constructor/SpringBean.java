package com.spring.c.constructor;

public class SpringBean implements SpringInterface {

	private String message;
	private int number;
	
	
	/*Spring Constructor Injection*/
	public SpringBean(String message) {

		this.message = message;
	}
	public SpringBean(String message,int number) {

		this.message = message;
		this.number = number;
	}

	public void displayMessage() {
		System.out.println("Spring " + message);
		System.out.println("Number " + number);
	}
}
