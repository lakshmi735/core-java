package com.xworkz.shoppingservice;

import com.xworkz.shoppingDTO.ShopDTO;

public interface ShopService {
	abstract boolean validateAndSave(ShopDTO dto);
	abstract boolean readDTO(int id);
	abstract boolean readName(String name);
	abstract boolean readEmail(String email);
	abstract boolean updateId(int id);
	abstract boolean updateName(String name);
	abstract boolean updateEamil(String email);
	abstract boolean deleteId(int id);
	abstract boolean deleteEmail(String email);


}
