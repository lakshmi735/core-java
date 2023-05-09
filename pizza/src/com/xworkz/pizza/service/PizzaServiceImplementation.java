package com.xworkz.pizza.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.repository.PizzaRepo;

public class PizzaServiceImplementation implements PizzaService{
	
	PizzaRepo repo;
	public PizzaServiceImplementation() {
		System.out.println("PizzaServiceImplementation");
	}
	public PizzaServiceImplementation(PizzaRepo repo) {
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(PizzaDTO dto) {
		System.out.println("validateAndSave");
		if(dto!=null)
		{
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		    Validator valid=factory.getValidator();
		    Set<ConstraintViolation<PizzaDTO>> violationMeassage=valid.validate(dto);
		    if(violationMeassage.isEmpty()) {
		    boolean save =this.repo.onSave(dto);
		    System.out.println(save);
		    	
		    }else {
		    	System.out.println(violationMeassage.toString());
		    }
		}else {
			System.out.println("dto is null");
		}
		return true;
	}

}
