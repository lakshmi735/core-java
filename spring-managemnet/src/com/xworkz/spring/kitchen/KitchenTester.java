package com.xworkz.spring.kitchen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KitchenTester {
	public static void main(String[] args) {
		
		ApplicationContext app=new AnnotationConfigApplicationContext(KitchenConfiguration.class);
		Kitchen kitchen=app.getBean("Kitchen",Kitchen.class);
		System.out.println(kitchen);
		
		Kitchen kitchen1=app.getBean("Kitchen1",Kitchen.class);
		System.out.println(kitchen1);
		
		Kitchen kitchen2=app.getBean("Kitchen2",Kitchen.class);
		System.out.println(kitchen2);
		
		Kitchen kitchen3=app.getBean("Kitchen3",Kitchen.class);
		System.out.println(kitchen3);
		
		Kitchen kitchen4=app.getBean("Kitchen4",Kitchen.class);
		System.out.println(kitchen4);
		
		
	}

}
