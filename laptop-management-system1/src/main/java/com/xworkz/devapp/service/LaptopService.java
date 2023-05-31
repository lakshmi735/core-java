package com.xworkz.devapp.service;

import java.util.List;

import com.xworkz.devapp.dto.LaptopDTO;

public interface LaptopService {
	
	boolean sendMail(String email);

	LaptopDTO validateAndSave(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptopsSer();
	
	LaptopDTO getLaptopByIdSer(int id);
	
	List<LaptopDTO> getByCompanyNameSer(String companyName);

	void updateLaptopByIdSer(LaptopDTO dto);
	
	List<LaptopDTO> deleteById(int id);
	

}
