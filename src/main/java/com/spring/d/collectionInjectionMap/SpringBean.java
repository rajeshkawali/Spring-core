package com.spring.d.collectionInjectionMap;

import java.util.Map;

public class SpringBean implements SpringInterface {

	private Map<Object, Object> listNames;
	
	public Map<Object, Object> getListNames() {
		return listNames;
	}
	public void setListNames(Map<Object, Object> listNames) {
		this.listNames = listNames;
	}
	

	public void displayList() {
		System.out.print("Hello " + listNames + " Welcome");
	}

}
