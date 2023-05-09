package com.xworkz.game.dto;




import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameDTO {
	
	
	private int id;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=16)
	
	private String gameName;
	
	private int no_of_players;
	
	private int no_of_team;

	private String place;
	
	private String game_start;
	
	private String game_end;

	private int no_of_games;

}
