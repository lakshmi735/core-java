package com.xworkz.game.boot;

import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.repository.GameRepo;
import com.xworkz.game.repository.GameRepoImplements;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImplements;

public class GameRunner {
	
	public static void main(String[] args) {
		System.out.println("this mvc project");
		
		GameDTO dt=new GameDTO(2,"cricket", 11, 6, "bangalore", "10AM", "1PM", 3);
		String query ="insert into game values(?,?,?,?,?)";
		GameRepo repo =new GameRepoImplements(query);
		
		GameService game = new GameServiceImplements(repo);
		game.validateAndSave(dt);
		
		
	}

}
