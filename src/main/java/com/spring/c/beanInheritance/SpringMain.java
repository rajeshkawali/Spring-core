package com.spring.c.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.c.beanInheritance.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/c/beanInheritance/SpringConfig.xml");
		//SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		//SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject1");
		//SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject2");
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject3");
		obj.displayMessage();
	}
}
