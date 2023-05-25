package com.spring.e.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.e.objectInjection.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/e/objectInjection/SpringConfig.xml");
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
