package com.xworkz.software.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.software.dto.SoftwareDTO;
import com.xworkz.software.repository.SoftwareRepository;


public class SoftwareServiceImplementation  implements SoftwareService{
	
	SoftwareRepository softwareRepository;
	
	public SoftwareServiceImplementation(SoftwareRepository softwareRepository) {
	
	this.softwareRepository=softwareRepository;
}
	

	@Override
	public boolean validationAndSave(SoftwareDTO dto) {
		System.out.println("validateAndSave");
		if(dto!=null)
		{
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		    Validator valid=factory.getValidator();
		    Set<ConstraintViolation<SoftwareDTO>> violationMeassage=valid.validate(dto);
		    if(violationMeassage.isEmpty()) {
		    boolean save =this.softwareRepository.onSave(dto);
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
	public boolean readById(int id) {
		if(id!=0) {
			System.out.println("you can Read the data");
			boolean read=this.softwareRepository.onRead(id);
			System.out.println("Read");
		}else {
			System.out.println("you cant Read");
		}
		return true;
	}

	@Override
	public boolean updateById(int id) {
		if(id!=0) {
			System.out.println("you can update the data");
			boolean update=this.softwareRepository.onUpdate(id);
			System.out.println("update");
		}else {
			System.out.println("you cant update");
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			System.out.println("you can delete the data");
			boolean delete=this.softwareRepository.onDelete(id);
			System.out.println("delete");
		}else {
			System.out.println("you cant delete");
		}
		return true;
	}
}
	
	


