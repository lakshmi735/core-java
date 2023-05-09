package com.xworkz.wedding.service;

import com.xworkz.wedding.dto.WeddingDTO;

public interface WeddingService {
	abstract boolean validateAndSave(WeddingDTO dto);
	abstract boolean updateDTO(int id);
	abstract boolean deleteDTO(int id);

}
