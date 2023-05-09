package com.xworkz.waterfall.boot;

import com.xworkz.waterfall.dto.WaterFallDTO;
import com.xworkz.waterfall.repository.WaterFallRepository;
import com.xworkz.waterfall.repository.WaterFallRepositoryImplementation;
import com.xworkz.waterfall.service.WaterFallService;
import com.xworkz.waterfall.service.WaterFallServiceImplementation;

public class WaterFallRunner {
	public static void main(String[] args) {
		
	
	System.out.println("this is MVC project");
	WaterFallDTO dto=new WaterFallDTO(5, "jogfalls", "karnataka", "830ft");
	String query = "insert into waterfall values(?,?,?,?)";
	WaterFallRepository repository= new WaterFallRepositoryImplementation(query);
	
	WaterFallService service = new WaterFallServiceImplementation(repository);
	service.validationAndSave(dto);
}
}
