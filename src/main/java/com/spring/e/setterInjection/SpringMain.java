package com.spring.e.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.e.setterInjection.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/e/setterInjection/SpringConfig.xml");
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
