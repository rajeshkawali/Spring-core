package com.spring.h.annotationJSR_250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class SpringBean implements SpringInterface {

	private SpringTest springtestA;
	private SpringTest springtestB;
	private SpringTest springtestC;

	public SpringTest getSpringtestA() {
		return springtestA;
	}

	@Resource
	public void setSpringtestA(SpringTest springtestA) {
		this.springtestA = springtestA;
	}

	public SpringTest getSpringtestB() {
		return springtestB;
	}

	@Resource(name="springtestB")
	public void setSpringtestB(SpringTest springtestB) {
		this.springtestB = springtestB;
	}

	public SpringTest getSpringtestC() {
		return springtestC;
	}

	@Resource
	public void setSpringtestC(SpringTest springtestC) {
		this.springtestC = springtestC;
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Spring myInit() method...");
	}
	@PreDestroy
	public void myDestroy() {
		System.out.println("Spring myDestroy() Method...");
	}

	
	public void displayMessage() {
		System.out.println("---------Spring AutoWiring Test----------");
		System.out.println(
				"springtestA valueA=" + springtestA.getValueA() + "\t springtestA valueB=" + springtestA.getValueB());
		System.out.println(
				"springtestB valueA=" + springtestB.getValueA() + "\t springtestB valueB=" + springtestB.getValueB());
		System.out.println(
				"springtestC valueA=" + springtestC.getValueA() + "\t springtestC valueB=" + springtestC.getValueB());

	}
}
