package com.xworkz.spring.restuarant1;

import org.springframework.stereotype.Component;

@Component(value="ashoka")
public class Ashoka implements Restuarant{
	
	
	
	   @Override
		public String serveFood() {
			System.out.println("Ashoka hotel");
			return Restuarant.super.serveFood();
		}

}
