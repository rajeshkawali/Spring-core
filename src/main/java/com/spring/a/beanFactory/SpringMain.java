package com.spring.a.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class SpringMain {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/spring/a/beanFactory/SpringConfig.xml");  
		//ClassPathResource resource = new ClassPathResource("com/spring/a/beanFactory/SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);  
		
		SpringInterface obj = (SpringBean) factory.getBean("beanObject");

		obj.getMessage();
	}
}
