package com.spring.f.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DisplayBeanFactoryPP implements BeanFactoryPostProcessor {

	
	//It will call before beanFactory initialiazation and before singleton initialiation.
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("BeanFactory Post Processor is Called...");
		
	}

	
	
	
}
