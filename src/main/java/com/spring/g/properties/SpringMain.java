package com.spring.g.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.g.properties.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/g/properties/SpringConfig.xml");
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
