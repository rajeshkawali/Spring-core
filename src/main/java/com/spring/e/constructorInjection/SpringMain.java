package com.spring.e.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.e.constructorInjection.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/e/constructorInjection/SpringConfig.xml");
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
