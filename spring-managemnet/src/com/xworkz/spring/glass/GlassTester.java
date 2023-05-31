package com.xworkz.spring.glass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlassTester {
	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(GlassConfiguration.class);
		Glass glass=app.getBean(Glass.class);
		System.out.println(glass);
	}
	
	
}
