package com.spring.d.collectionInjectionList;

import java.util.List;

public class SpringBean implements SpringInterface {

	private List<String> listNames;
	
	
	
	public List<String> getListNames() {
		return listNames;
	}
	public void setListNames(List<String> listNames) {
		this.listNames = listNames;
	}



	public void displayList() {
		System.out.print("Hello " + listNames + " Welcome");
	}
	
	
}
