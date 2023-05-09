package com.xworkz.pizza.boot;

import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.repository.PizzaRepo;
import com.xworkz.pizza.repository.PizzaRepoImplementation;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImplementation;

public class PizzaRunner {
	
	public static void main(String[] args) {
		PizzaDTO dt= new PizzaDTO(2, "pizzaHut", "rr nagar", 746474745, "pizza@gmail.com");
		
		String query="insert into pizza values(?,?,?,?,?)";
		
		PizzaRepo repo= new PizzaRepoImplementation(query);
		
		PizzaService service = new PizzaServiceImplementation(repo);
		service.validateAndSave(dt);
	}

}
