package com.zensar;


import org.aopalliance.intercept.Joinpoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	@Before("execution( com.zensar.Shoppingcart.checkout(..))")
	//getting the data value with joinpoint
	public void beforelogger(Joinpoint jp) {
		System.out.println(jp.Signature());
		String args=jp.getArgs()[0].toString();
		System.out.println(" before Logger with argument value of checkout method in shopcart" + args);
		
	}
@After("execution( * *. *.checkout(..))")
public void afterlogger() {
	System.out.println("After Logger");
		
	}
//getting return type of method defined in shopcart 

@PointCut("execution(* com.zensar.ShoppingCart.Quantity(..))")
public void afterReturningPointCut() {
	
}

@AfterReturning(pointcut="afterReturningPointCut()",returning ="retVal")
public void afterReturning(String retVal) {
	System.out.println("After Returning"+retVal);
}
}
