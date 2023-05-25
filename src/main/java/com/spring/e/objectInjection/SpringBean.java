package com.spring.e.objectInjection;

public class SpringBean implements SpringInterface {

	private SpringTest springtestA;
	private SpringTest springtestB;
	private SpringTest springtestC;

	public SpringTest getSpringtestA() {
		return springtestA;
	}

	public void setSpringtestA(SpringTest springtestA) {
		this.springtestA = springtestA;
	}

	public SpringTest getSpringtestB() {
		return springtestB;
	}

	public void setSpringtestB(SpringTest springtestB) {
		this.springtestB = springtestB;
	}

	public SpringTest getSpringtestC() {
		return springtestC;
	}

	public void setSpringtestC(SpringTest springtestC) {
		this.springtestC = springtestC;
	}

	
	public void displayMessage() {
		System.out.println("Spring Test");
		System.out.println("springtestA valueA="+springtestA.getValueA()+"\t springtestA valueB="+springtestA.getValueB());
		System.out.println("springtestB valueA="+springtestB.getValueA()+"\t springtestB valueB="+springtestB.getValueB());
		System.out.println("springtestC valueA="+springtestC.getValueA()+"\t springtestC valueB="+springtestC.getValueB());
		

	}
}
