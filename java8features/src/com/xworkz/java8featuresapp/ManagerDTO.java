package com.xworkz.java8featuresapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class ManagerDTO {
	
	private Integer id;
	private String name;
	private String qualification;
	private Integer salary;
	

}
