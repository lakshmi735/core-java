package com.xworkz.wedding.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.wedding.dto.WeddingDTO;
import com.xworkz.wedding.repository.WeddingRepo;

public class WeddingServiceImplements implements WeddingService{
	
	WeddingRepo wedding;
	public WeddingServiceImplements() {
		System.out.println("WeddingServiceImplements");
		
	}
	public WeddingServiceImplements(WeddingRepo wedding) {
		this.wedding=wedding;
		
	}

	@Override
	public boolean validateAndSave(WeddingDTO dto) {
		System.out.println("validate and save");
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<WeddingDTO>> violationMeassage = valid.validate(dto);
			if(violationMeassage.isEmpty()) {
				boolean save = this.wedding.onSve(dto);
				System.out.println(save);
			
			}else {
				System.out.println(violationMeassage.toString());
			}
		}else {
			System.out.println("dto is null");
		}
		return true;
	}
	@Override
	public boolean updateDTO(int id) {
		if(id!=0) {
			System.out.println("you can update the data");
			boolean update=this.wedding.onUpdate(id);
			System.out.println("update");
		}else {
			System.out.println("you cant update");
		}
		return true;
	}
	@Override
	public boolean deleteDTO(int id) {
		if(id!=0) {
			System.out.println("you can delete the data");
			boolean delete=this.wedding.onUpdate(id);
			System.out.println("delete");
		}else {
			System.out.println("you cant delete");
		}
		return true;
		
	}
	
		}
	


