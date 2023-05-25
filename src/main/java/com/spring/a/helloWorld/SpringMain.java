package com.spring.a.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {

		//ClassPathResource res = new ClassPathResource("SpringConfig.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/a/helloWorld/SpringConfig.xml");
		SpringInterface obj = (SpringBean) context.getBean("springBeanObject");
		
		obj.display();
		obj.getMessage();
		
	}

}
