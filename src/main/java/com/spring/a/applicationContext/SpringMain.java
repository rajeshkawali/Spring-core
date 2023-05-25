package com.spring.a.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/a/applicationContext/SpringConfig.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/a/applicationContext/SpringConfig.xml");
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");

		obj.getMessage();
	}

}
