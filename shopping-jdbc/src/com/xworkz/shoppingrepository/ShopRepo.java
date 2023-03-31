package com.xworkz.shoppingrepository;

import com.xworkz.shoppingDTO.ShopDTO;

public interface ShopRepo {
	
	abstract boolean onSave(ShopDTO dto);
	abstract boolean onRead(int id);
	abstract boolean onReadByName(String name);
	abstract boolean onReadByEmail(String email);
	abstract boolean onUpdateById(int id);
	abstract boolean onUpdateByName(String name);
	abstract boolean onUpdateByEmail(String email);
	abstract boolean onDeleteById(int id);
	abstract boolean onDeleteByEmail(String email);

}
