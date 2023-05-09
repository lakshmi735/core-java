package com.xworkz.game.repository;

import com.xworkz.game.dto.GameDTO;

public interface GameRepo {
	abstract boolean onSave(GameDTO dto);

}
