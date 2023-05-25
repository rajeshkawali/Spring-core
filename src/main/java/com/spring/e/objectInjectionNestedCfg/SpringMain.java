package com.spring.e.objectInjectionNestedCfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.e.objectInjectionNestedCfg.SpringBean;

public class SpringMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/e/objectInjectionNestedCfg/SpringConfig.xml");
		//SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject-alias");
		//SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject-alias-name");
		SpringInterface obj = (SpringBean) applicationContext.getBean("beanObject");
		obj.displayMessage();
	}
}
