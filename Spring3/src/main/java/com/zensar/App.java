package com.zensar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
		
		AbstractApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
		 Order order =(Order) applicationContext.getBean("Order"); 
         System.out.println("Spring framework order" + order);
		 AnnotationConfigApplicationContext  annotation_ioc_container =
				 new AnnotationConfigApplicationContext(AppConfig.class);
			
//			  System.out.println("Tom_bean"+annotation_ioc_container.getBean("Tom_bean"));
//			  System.out.println("Jerry_bean"+annotation_ioc_container.getBean("Jerry_bean"));
			 
		 System.out.println("myclassbeans are "+annotation_ioc_container.getBean(Contact.class));
		 annotation_ioc_container.registerShutdownHook();
		 
 		
    }
}

