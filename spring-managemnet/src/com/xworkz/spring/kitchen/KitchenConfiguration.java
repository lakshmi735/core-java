package com.xworkz.spring.kitchen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KitchenConfiguration {
	
	@Bean(name="Kitchen")
	public Kitchen getKitchen() {
		Kitchen kitchen = new Kitchen();
		kitchen.setId(1);
		kitchen.setType("one wall kitchen");
		kitchen.setNoOfItems(30);
		return kitchen;
	}
	@Bean(name="Kitchen1")
	public Kitchen getKitchen1() {
		Kitchen kitchen = new Kitchen();
		kitchen.setId(2);
		kitchen.setType("U Shape kitchen");
		kitchen.setNoOfItems(50);
		return kitchen;
	}
	@Bean(name="Kitchen2")
	public Kitchen getKitchen2() {
		Kitchen kitchen = new Kitchen();
		kitchen.setId(3);
		kitchen.setType("one wall kitchen");
		kitchen.setNoOfItems(60);
		return kitchen;
	}
	@Bean(name="Kitchen3")
	public Kitchen getKitchen3() {
		Kitchen kitchen = new Kitchen();
		kitchen.setId(4);
		kitchen.setType("U Shape wall kitchen");
		kitchen.setNoOfItems(40);
		return kitchen;
	}
	@Bean(name="Kitchen4")
	public Kitchen getKitchen4() {
		Kitchen kitchen = new Kitchen();
		kitchen.setId(5);
		kitchen.setType("one wall kitchen");
		kitchen.setNoOfItems(70);
		return kitchen;
	}



}
