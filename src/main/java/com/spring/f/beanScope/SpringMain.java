package com.spring.f.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.f.beanScope.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/f/beanScope/SpringConfig.xml");
		
		SpringBean obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.setName("Trimax...");
		obj.displayMessage();
		
		SpringBean obj1 = (SpringBean) applicationContext.getBean("beanObject1");
		obj1.setName("Rajesh Here...");
		obj1.displayMessage();
		
		SpringBean obj2 = (SpringBean) applicationContext.getBean("beanObject2");
		obj2.displayMessage();
	}
}
