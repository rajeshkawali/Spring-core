package com.spring.c.beanAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.c.beanAutoWiring.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/c/beanAutoWiring/SpringConfig.xml");
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
