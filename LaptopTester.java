package com.xworkz.spring.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTester {
	public static void main(String[] args) {
		
		ApplicationContext application=new AnnotationConfigApplicationContext(LaptopConfiguration.class);
		Laptop laptop=application.getBean("Laptop",Laptop.class);
		System.out.println(laptop);
		Laptop laptop1=application.getBean("Laptop1",Laptop.class);
		System.out.println(laptop1);
		Laptop laptop2=application.getBean("Laptop2",Laptop.class);
		System.out.println(laptop2);
		Laptop laptop3=application.getBean("Laptop3",Laptop.class);
		System.out.println(laptop3);
		Laptop laptop4=application.getBean("Laptop4",Laptop.class);
		System.out.println(laptop4);
	}

}
