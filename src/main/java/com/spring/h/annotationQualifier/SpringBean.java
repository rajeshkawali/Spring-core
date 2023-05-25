package com.spring.h.annotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SpringBean implements SpringInterface {

	private SpringTest springtestA;
	private SpringTest springtestB;
	private SpringTest springtestC;

	
	public SpringTest getSpringtestA() {
		return springtestA;
	}
	
	@Autowired
	@Qualifier("springtestAQualifier")
	public void setSpringtestA(SpringTest springtestA) {
		this.springtestA = springtestA;
	}

	public SpringTest getSpringtestB() {
		return springtestB;
	}
	
	@Autowired
	public void setSpringtestB(SpringTest springtestB) {
		this.springtestB = springtestB;
	}
	
	public SpringTest getSpringtestC() {
		return springtestC;
	}
	
	@Autowired
	public void setSpringtestC(SpringTest springtestC) {
		this.springtestC = springtestC;
	}

	
	public void displayMessage() {
		System.out.println("---------Spring AutoWiring Test----------");
		System.out.println("springtestA valueA="+springtestA.getValueA()+"\t springtestA valueB="+springtestA.getValueB());
		System.out.println("springtestB valueA="+springtestB.getValueA()+"\t springtestB valueB="+springtestB.getValueB());
		System.out.println("springtestC valueA="+springtestC.getValueA()+"\t springtestC valueB="+springtestC.getValueB());
		

	}
}
