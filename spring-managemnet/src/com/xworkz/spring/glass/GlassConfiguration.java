package com.xworkz.spring.glass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlassConfiguration {
	@Bean
	public Glass getGlass() {
		Glass glass=new Glass();
		glass.setId(1);
		glass.setBrand("Clorning");
		return glass;
	}

}
