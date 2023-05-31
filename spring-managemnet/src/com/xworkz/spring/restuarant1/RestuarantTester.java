package com.xworkz.spring.restuarant1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RestuarantTester {
	public static void main(String[] args) {
		
		ApplicationContext app= new AnnotationConfigApplicationContext(RestuarantConfi.class);
		Owner owner=app.getBean(Owner.class);
		owner.getRestuarant().serveFood(); 
	}

}
