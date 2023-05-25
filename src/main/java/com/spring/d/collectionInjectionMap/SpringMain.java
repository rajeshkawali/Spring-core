package com.spring.d.collectionInjectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/d/collectionInjectionMap/SpringConfig.xml");
		SpringInterface obj = (SpringBean) context.getBean("springBeanObject");
		
		obj.displayList();
		
		
	}

}
