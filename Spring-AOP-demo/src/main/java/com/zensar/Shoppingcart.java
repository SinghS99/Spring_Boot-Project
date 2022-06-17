package com.zensar;

import org.springframework.stereotype.Component;


@Component
public class Shoppingcart {
	
	public void checkout(String status) {
	
		//Logging
		//Authentication
		//Sanitize Data --these are cross cutting concern
		System.out.println("checkout method of shopping cart called");
	}
 public int Quantity() {
	 
	 return 2;
	 
 }
}
