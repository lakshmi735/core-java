package com.xworkz.spring.automobile;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
@Component
@NoArgsConstructor
public class SpareParts {
	
	
     private int id;
	
	private String partsName;
	
	private String type;
	private int price;

}
