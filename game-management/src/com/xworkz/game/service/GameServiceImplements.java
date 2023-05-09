package com.xworkz.game.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.repository.GameRepo;

public class GameServiceImplements implements GameService {
	
	GameRepo game;
	public GameServiceImplements() {
		System.out.println("CricketServiceImplementation");
	}
	public GameServiceImplements(GameRepo game) {
		this.game=game;
	}


	@Override
	public boolean validateAndSave(GameDTO dto) {
		System.out.println("this is validation and save");
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<GameDTO>> violationMeassage = valid.validate(dto);
			if(violationMeassage.isEmpty()) {
				boolean save = this.game.onSave(dto);
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
