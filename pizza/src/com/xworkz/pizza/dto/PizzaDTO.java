package com.xworkz.pizza.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PizzaDTO {
	
	private int id;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=10)
	private String shopName;
	private String location;
	private long contactNo;

	private String email;

}
