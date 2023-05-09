package com.xworkz.wedding.repository;

import com.xworkz.wedding.dto.WeddingDTO;

public interface WeddingRepo {
	
	abstract boolean onSve(WeddingDTO dto);
	abstract boolean onUpdate(int id);
	abstract boolean onDelete(int id);
	

}
