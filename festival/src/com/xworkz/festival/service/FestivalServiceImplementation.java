package com.xworkz.festival.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.repository.FestivalRepo;



public class FestivalServiceImplementation implements FestivalService{
	FestivalRepo fest;
	

	public FestivalServiceImplementation() {
		System.out.println("CricketServiceImplementation");
	}
	public FestivalServiceImplementation(FestivalRepo fest) {
		this.fest=fest;
	}


	@Override
	public boolean validateAndSave(FestivalDTO dto) {
		System.out.println("this is validation and save");
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<FestivalDTO>> violationMeassage = valid.validate(dto);
			if(violationMeassage.isEmpty()) {
				boolean save = this.fest.onSave(dto);
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
