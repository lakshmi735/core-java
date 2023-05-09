package com.xworkz.software.boot;

import com.xworkz.software.dto.SoftwareDTO;
import com.xworkz.software.repository.SoftwareRepository;
import com.xworkz.software.repository.SoftwareRepositoryImplementation;
import com.xworkz.software.service.SoftwareService;
import com.xworkz.software.service.SoftwareServiceImplementation;

public class SoftwareRunner {
	public static void main(String[] args) {
		System.out.println("this is MVC project");
		SoftwareDTO dto=new SoftwareDTO(4, "payment management", "HCL", "bangalore", "C++");
		String query = "insert into software1 values(?,?,?,?,?)";
		SoftwareRepository repository= new SoftwareRepositoryImplementation(query);
		
		SoftwareService service = new SoftwareServiceImplementation(repository);
		//service.validationAndSave(dto);
		//service.readById(1);
		service.updateById(1);
		//service.deleteById(1);
		
	}

}
