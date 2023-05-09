package com.xworkz.pizza.service;

import com.xworkz.pizza.dto.PizzaDTO;

public interface PizzaService {
	
	abstract boolean validateAndSave(PizzaDTO dto);

}
