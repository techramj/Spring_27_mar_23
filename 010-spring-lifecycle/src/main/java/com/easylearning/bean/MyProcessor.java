package com.easylearning.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor postProcessBeforeInitialization method called. beanName="+beanName+"  bean="+bean);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor postProcessAfterInitialization method called. beanName="+beanName+"  bean="+bean);
		return bean;
	}
}
