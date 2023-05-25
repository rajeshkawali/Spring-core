package com.spring.f.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBPP implements BeanPostProcessor {

	//It will call before bean initialiazation and after bean initialiazation of each and every bean.
	
	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {
		
		System.out.println("In After Initialization Method.Bean Name is=>"+beanName);
		return beanObject;
	}
	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
		
		System.out.println("In Before Initialization Method.Bean Name is=>"+beanName);
		return beanObject;
	}
}
