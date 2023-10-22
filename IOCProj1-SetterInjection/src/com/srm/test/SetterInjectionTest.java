package com.srm.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.srm.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		//Locate and hold spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/com/srm/cfgs/applicationContext.xml");
		
		//create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//get Target Bean class Object
		Object obj = factory.getBean("wmg");
		
		//type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the business method
		 String result = generator.generateWishMessage("Smruti");
		 System.out.println("Result : "+result);
	}

}