package com.xworkz.waterfall.repository;


import com.xworkz.waterfall.dto.WaterFallDTO;

public interface WaterFallRepository {
	
	abstract boolean onSave(WaterFallDTO dto);

}
