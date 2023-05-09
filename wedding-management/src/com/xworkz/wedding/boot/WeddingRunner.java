package com.xworkz.wedding.boot;


import com.xworkz.wedding.dto.WeddingDTO;
import com.xworkz.wedding.repository.WeddingRepo;
import com.xworkz.wedding.repository.WeddingRepoImplemets;
import com.xworkz.wedding.service.WeddingService;
import com.xworkz.wedding.service.WeddingServiceImplements;

public class WeddingRunner {
	
	public static void main(String[] args) {
		WeddingDTO dt=new WeddingDTO(10, "rr nagar", "flower", 18, "monday");
		
		String query ="insert into wedding values(?,?,?,?,?)";
		
		WeddingRepo repo =new WeddingRepoImplemets(query);
		
		WeddingService service=new WeddingServiceImplements(repo);
		service.validateAndSave(dt);
		service.updateDTO(1);
		service.deleteDTO(4);
	}

}
