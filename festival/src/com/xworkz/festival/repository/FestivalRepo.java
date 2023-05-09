package com.xworkz.festival.repository;

import com.xworkz.festival.dto.FestivalDTO;

public interface FestivalRepo {
	
	abstract boolean onSave(FestivalDTO dto);

}
