package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.PizzaDTO;

public interface PizzaRepo {
	
	abstract boolean onSave(PizzaDTO dto);

}
