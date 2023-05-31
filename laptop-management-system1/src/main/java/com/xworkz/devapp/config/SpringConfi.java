package com.xworkz.devapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages  = "com.xworkz.devapp")
@Component
public class SpringConfi   {
	
	
   @Bean
   public ViewResolver getViewResolver() {
	   return new InternalResourceViewResolver("/",".jsp");
   }
}
