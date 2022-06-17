package com.zensar;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class AuthenticateAspect {
	
	//meaning whatever method present inside any class of specfied package i.e shopping cart execute them
	@Poincut("within(com.zensar. .*)")
 public void authenticatingPointCut() {
		
	}
	
	@Poincut("within(com.zensar. .*)")
  public void authorizingPointCut() {
	 
 }
	//Calling Pointcuts
	@Before("authenticatingPointCut() && authorizingPointCut()")
	public void authenticating() {
		System.out.println("Authenticating the request");
	}
}
