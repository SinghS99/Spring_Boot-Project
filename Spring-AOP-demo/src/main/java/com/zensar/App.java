package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ch.qos.logback.core.status.Status;


public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
    Shoppingcart cart = context.getBean(Shoppingcart.class);
     cart.checkout("Cancel");
     
    }
}