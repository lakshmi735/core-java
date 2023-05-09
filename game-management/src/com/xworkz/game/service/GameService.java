package com.xworkz.game.service;

import com.xworkz.game.dto.GameDTO;

public interface GameService {
	abstract boolean validateAndSave(GameDTO dto);

}
