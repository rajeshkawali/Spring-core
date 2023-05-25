package com.spring.f.applicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean implements ApplicationContextAware,BeanNameAware,SpringInterface {

	private SpringTest springtestA;
	private SpringTest springtestB;
	private SpringTest springtestC;
	//private ApplicationContext context = null;
	
	
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

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("Spring getBeanDefinitionCount="+context.getBeanDefinitionCount());
		System.out.println("Spring getDisplayName="+context.getDisplayName());
		System.out.println("Spring getStartupDate="+context.getStartupDate());
		
	}

	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("Spring beanName="+beanName);
	}
}
