package com.spring.f.beanScope;

public class SpringBean implements SpringInterface {

	private String name;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void displayMessage() {
		System.out.println("Spring Test==>"+name);
		
	}
}
