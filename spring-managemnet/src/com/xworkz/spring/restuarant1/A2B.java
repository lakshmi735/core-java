package com.xworkz.spring.restuarant1;

import org.springframework.stereotype.Component;

@Component(value="a2b")
public class A2B implements Restuarant {
	
	
	    @Override
		public String serveFood() {
		System.out.println("a2b hotel");
			return Restuarant.super.serveFood();
		}
	

}
