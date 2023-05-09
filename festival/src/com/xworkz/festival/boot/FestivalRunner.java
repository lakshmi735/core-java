package com.xworkz.festival.boot;

import com.xworkz.festival.dto.FestivalDTO;
import com.xworkz.festival.repository.FestivalRepo;
import com.xworkz.festival.repository.FestivalRepoImplementation;
import com.xworkz.festival.service.FestivalService;
import com.xworkz.festival.service.FestivalServiceImplementation;

public class FestivalRunner {
	public static void main(String[] args) {
		System.out.println("this mvc project");
		
		FestivalDTO dt=new FestivalDTO(5, "Dipavali", "flower", "jamun", "mysore");
		String query ="insert into festival values(?,?,?,?,?)";
		FestivalRepo repo = new FestivalRepoImplementation(query);
		
		FestivalService service = new FestivalServiceImplementation(repo);
		service.validateAndSave(dt);

}
}