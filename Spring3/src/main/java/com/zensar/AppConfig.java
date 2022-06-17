package com.zensar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	//<bean id="mycontact" class="com.zensa.AppConfig"/>
	@Bean(name="Tom_bean")
	public Contact getTomContact() {
		return new Contact("Tom_bean");
	}
	
	 @Primary
	  @Bean(name="Jerry_bean") public Contact getJerryContact() { return new
	  Contact("Jerry_bean"); }
	 
}
	


class Contact{
	private String name;
	
	@Override
	public String toString() {
		return this.name=name;
				
	}

	public Contact() {
		
	}
	

	public Contact(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
