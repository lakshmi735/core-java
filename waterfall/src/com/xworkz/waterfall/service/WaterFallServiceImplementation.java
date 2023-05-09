package com.xworkz.waterfall.service;


import com.xworkz.waterfall.dto.WaterFallDTO;
import com.xworkz.waterfall.repository.WaterFallRepository;

public class WaterFallServiceImplementation implements WaterFallService {
	WaterFallRepository waterFallRepository;
	public WaterFallServiceImplementation(WaterFallRepository waterFallRepository) {
		this.waterFallRepository=waterFallRepository;
	}

	@Override
	public boolean validationAndSave(WaterFallDTO dto) {
		System.out.println("this is validateAndSave");
		boolean save=this.waterFallRepository.onSave(dto);
		System.out.println(save);
		return true;
	}

}
