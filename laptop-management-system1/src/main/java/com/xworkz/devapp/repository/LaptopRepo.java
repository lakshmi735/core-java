package com.xworkz.devapp.repository;

import java.util.List;

import com.xworkz.devapp.dto.LaptopDTO;

public interface LaptopRepo {
	
	
LaptopDTO saveLaptop(LaptopDTO dto);
	
	List<LaptopDTO> getAllLaptopRepo();
	
	List<LaptopDTO> getByCompanyNameRepo(String companyName);

	LaptopDTO getAllLaptopByIdRepo(int id);

	void updateLaptopByIdRepo(LaptopDTO dto);

	List<LaptopDTO> deleteByIdRepo(int id);
}
