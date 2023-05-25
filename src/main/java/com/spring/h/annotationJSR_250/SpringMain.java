package com.spring.h.annotationJSR_250;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/h/annotationJSR_250/SpringConfig.xml");
		applicationContext.registerShutdownHook();
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
