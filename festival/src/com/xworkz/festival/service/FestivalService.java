package com.xworkz.festival.service;

import com.xworkz.festival.dto.FestivalDTO;

public interface FestivalService {
	
	abstract boolean validateAndSave(FestivalDTO dto);

} 
