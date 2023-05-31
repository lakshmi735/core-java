package com.xworkz.spring.FoodStall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfiguration {
	@Bean(name="Food")
	public Food getFood() {
		Food food= new Food();
		food.setId(1);
		food.setName("Biriyani");
		return food;
	}
	@Bean(name="Food1")
	public Food getFood1() {
		Food food= new Food();
		food.setId(2);
		food.setName("Idli");
		return food;
	}
	@Bean(name="Food2")
	public Food getFood2() {
		Food food= new Food();
		food.setId(3);
		food.setName("Doosa");
		return food;
	}
	@Bean(name="Food3")
	public Food getFood3() {
		Food food= new Food();
		food.setId(4);
		food.setName("Pizza");
		return food;
	}
	@Bean(name="Food4")
	public Food getFood4() {
		Food food= new Food();
		food.setId(5);
		food.setName("Chitranna");
		return food;
	}
	
	

}
