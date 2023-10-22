//WishMessageGenerator.java
package com.srm.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;   //ctrl+shift+o to import package

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param Constructor");
	}
	
	//alt+shift+s to get setter and getter method
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	//business method
	public String generateWishMessage(String user) {
		
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		//get current hours of the day
		int hr = date.getHours();
		
		if(hr<12)
			return "Good Morning :- " +user;
		else if (hr<16) 
			return "Good Afternoon :- "+user;
		else if (hr<20)
			return "Good Evening :- "+user;
		else
			return "Good Night :- "+user;
		
	}
	
}
