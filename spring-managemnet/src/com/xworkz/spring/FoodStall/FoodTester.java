package com.xworkz.spring.FoodStall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTester {
	
	public static void main(String[] args) {
		ApplicationContext application = new AnnotationConfigApplicationContext(FoodConfiguration.class);
		Food food=application.getBean("Food",Food.class);
		System.out.println(food);
		
		Food food1=application.getBean("Food1",Food.class);
		System.out.println(food1);
		
		Food food2=application.getBean("Food2",Food.class);
		System.out.println(food2);
		
		Food food3=application.getBean("Food3",Food.class);
		System.out.println(food3);
		
		Food food4=application.getBean("Food4",Food.class);
		System.out.println(food4);
		
		
	}
	

}
