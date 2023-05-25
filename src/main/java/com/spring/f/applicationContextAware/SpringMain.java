package com.spring.f.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.f.applicationContextAware.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/f/applicationContextAware/SpringConfig.xml");
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
