package com.xworkz.spring.laptop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfiguration {
	@Bean(name="Laptop")
	public Laptop getLaptop() {
		
		Laptop laptop=new Laptop();
		laptop.setId(1);
		laptop.setBrand("Dell");
		laptop.setPrice(39000);
		return laptop;
	}
	@Bean(name="Laptop1")
	public Laptop getLaptop1() {
		
		Laptop laptop=new Laptop();
		laptop.setId(2);
		laptop.setBrand("LG");
		laptop.setPrice(35000);
		return laptop;
	}
	@Bean(name="Laptop2")
	public Laptop getLaptop2() {
		
		Laptop laptop=new Laptop();
		laptop.setId(3);
		laptop.setBrand("LG");
		laptop.setPrice(30000);
		return laptop;
	}
	@Bean(name="Laptop3")
	public Laptop getLaptop3() {
		
		Laptop laptop=new Laptop();
		laptop.setId(4);
		laptop.setBrand("Acer");
		laptop.setPrice(38000);
		return laptop;
	}
	@Bean(name="Laptop4")
	public Laptop getLapto4() {
		
		Laptop laptop=new Laptop();
		laptop.setId(5);
		laptop.setBrand("Dell");
		laptop.setPrice(35000);
		return laptop;
	}

}
