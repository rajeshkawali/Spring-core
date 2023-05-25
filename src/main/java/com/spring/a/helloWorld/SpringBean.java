package com.spring.a.helloWorld;

public class SpringBean implements SpringInterface {

	private String message;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* using setter method */
	public void setMessage(String message) {
		this.message = message;
	}

	public void display() {
		System.out.print("Hello " + name + " Welcome to ");
	}
	public void getMessage() {
		System.out.println("Spring " + message + " Program");
	}
	
}
