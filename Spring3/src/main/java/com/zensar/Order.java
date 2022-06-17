package com.zensar;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class Order implements BeanNameAware,BeanPostProcessor,InitializingBean,BeanFactoryPostProcessor {

	private Item item;
	private String title;
	
	
	
	public Order() {
		super();
		System.out.println("I am Default construtor");
	}
	public Item getItem() {
		System.out.println("inside get");
		return item;
	}
	public void setItem(Item item) {
		System.out.println("inside set");
		this.item = item;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
		System.out.println("I am Paremetrized constructor");
	}
	public String toString() {
		
		return this.title=title;
	}
	public void setBeanName(String name) {
		System.out.println("inside aware of bean");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Intilaize bean");
		
	}
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("inside post process");
		
	}
		

	}


