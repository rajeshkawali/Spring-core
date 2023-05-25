package com.spring.f.initializeDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringBean implements InitializingBean,DisposableBean,SpringInterface {

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
		
		System.out.println("springtestA valueA="+springtestA.getValueA()+"\t springtestA valueB="+springtestA.getValueB());
		System.out.println("springtestB valueA="+springtestB.getValueA()+"\t springtestB valueB="+springtestB.getValueB());
		System.out.println("springtestC valueA="+springtestC.getValueA()+"\t springtestC valueB="+springtestC.getValueB());
		
	}
	
	//defined in SpringConfig file
	public void myInit(){
		System.out.println("Spring myInit() method...");
	}
	//defined in SpringConfig file
	public void myDestroy(){
		System.out.println("Spring myDestroy() Method...");
	}
	//defined in SpringConfig file
	public void myInitGlobal(){
		System.out.println("Spring myInitGlobal() method...");
	}
	//defined in SpringConfig file
	public void myDestroyGlobal(){
		System.out.println("Spring myDestroyGlobal() Method...");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Spring InitializingBean afterPropertiesSet() method...");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Spring DisposableBean destroy() Method...");
		
	}

}
