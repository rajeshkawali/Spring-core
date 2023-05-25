package com.spring.f.initializeDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/f/initializeDestroy/SpringConfig.xml");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/f/initializeDestroy/SpringConfig.xml");
		applicationContext.registerShutdownHook();
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
