package com.xworkz.shoppingboot;

import com.xworkz.shoppingDTO.ShopDTO;
import com.xworkz.shoppingrepository.ShopRepo;
import com.xworkz.shoppingrepository.ShopRepoImplements;
import com.xworkz.shoppingservice.ShopService;
import com.xworkz.shoppingservice.ShopServiceImplements;

public class ShopRunner {
	public static void main(String[] args) {
		
		ShopDTO shop=new ShopDTO(1, "barath", "barath@gmail.com");
		ShopDTO shop1=new ShopDTO(2, "ganaga", "ganaga@gmail.com");
		ShopDTO shop2=new ShopDTO(3, "vinod", "vinod@gmail.com");
		ShopDTO shop3=new ShopDTO(4, "lavanya", "lavanya@gmail.com");
		ShopDTO shop4=new ShopDTO(5, "chetan", "chetan@gmail.com");
		String query ="insert into shopping_jdbc values(?,?,?)";
		
		ShopRepo repo=new ShopRepoImplements(query);
		ShopService service=new ShopServiceImplements(repo);
		
		//service.validateAndSave(shop);
		//service.validateAndSave(shop1);
		//service.validateAndSave(shop2);
		//service.validateAndSave(shop3);
		//service.validateAndSave(shop4);
		/*service.readDTO(1);
		service.readDTO(2);
		service.readDTO(3);
		service.readDTO(4);
		service.readDTO(5);*/
		
		//service.updateId(1);
		//service.updateName("barathi");
		//service.updateEamil("vinod@gmail.com");
		
		//service.deleteId(4);
		//service.deleteEmail("chetan@gmail.com");
		
		//service.readName("vinodh kumar");
		service.readEmail("vinod@gmail.com");
		
		
		
	
		
	}

}
