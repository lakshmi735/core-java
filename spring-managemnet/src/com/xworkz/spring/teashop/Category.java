package com.xworkz.spring.teashop;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@Data
@AllArgsConstructor
@ToString 
@NoArgsConstructor
public class Category {
	
	private int id;
	private String itemName;
	private int price;

}
