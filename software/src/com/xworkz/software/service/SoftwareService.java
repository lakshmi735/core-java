package com.xworkz.software.service;

import com.xworkz.software.dto.SoftwareDTO;

public interface SoftwareService {
	
	abstract boolean validationAndSave(SoftwareDTO dto);
	abstract boolean readById(int id);
	abstract boolean updateById(int id);
	abstract boolean deleteById(int id);

}
