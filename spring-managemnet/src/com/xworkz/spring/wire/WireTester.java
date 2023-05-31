package com.xworkz.spring.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WireTester {
	public static void main(String[] args) {
		ApplicationContext application= new AnnotationConfigApplicationContext(WireConfiguration.class);
		Wire wire=application.getBean("Wire",Wire.class);
		System.out.println(wire);
		
		Wire wire1=application.getBean("Wire1",Wire.class);
		System.out.println(wire1);
		
		Wire wire2=application.getBean("Wire2",Wire.class);
		System.out.println(wire2);
		
		Wire wire3=application.getBean("Wire3",Wire.class);
		System.out.println(wire3);
		
		Wire wire4=application.getBean("Wire4",Wire.class);
		System.out.println(wire4);
		
		
	}

}
