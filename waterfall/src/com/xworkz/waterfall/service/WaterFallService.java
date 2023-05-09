package com.xworkz.waterfall.service;


import com.xworkz.waterfall.dto.WaterFallDTO;

public interface WaterFallService {
	abstract boolean validationAndSave(WaterFallDTO dto);

}
