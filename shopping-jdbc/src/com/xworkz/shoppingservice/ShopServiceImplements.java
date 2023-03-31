package com.xworkz.shoppingservice;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shoppingDTO.ShopDTO;
import com.xworkz.shoppingrepository.ShopRepo;


public class ShopServiceImplements implements ShopService {
	ShopRepo shopping;
	public ShopServiceImplements() {
		System.out.println("this is ShopServiceImplements ");
	}
	public ShopServiceImplements(ShopRepo shopping) {
		this.shopping=shopping;
	}

	@Override
	public boolean validateAndSave(ShopDTO dto) {
		System.out.println("validate and save");
		if(dto!=null) {
			ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
			Validator valid = factory.getValidator();
			Set<ConstraintViolation<ShopDTO>> violationMeassage = valid.validate(dto);
			if(violationMeassage.isEmpty()) {
				boolean save = this.shopping.onSave(dto);
				System.out.println(save);
			
			}else {
				System.out.println(violationMeassage.toString());
			}
		}else {
			System.out.println("dto is null");
		}
		return true;
	}
	@Override
	public boolean readDTO(int id) {
		if(id!=0) {
			System.out.println("you can read the data");
			boolean read=this.shopping.onRead(id);
			System.out.println("read");
		}else {
			System.out.println("you cant read");
		}
		return true;
	}
	@Override
	public boolean updateId(int id) {
		if(id!=0) {
			System.out.println("you can update the data");
			boolean update=this.shopping.onUpdateById(id);
			System.out.println("update");
		}else {
			System.out.println("you cant update");
		}
		return true;
	}

	@Override
	public boolean updateName(String name) {
		if(name!=null) {
			System.out.println("you can update the data");
			boolean update1=this.shopping.onUpdateByName(name);
			System.out.println("update1");
		}else {
			System.out.println("you cant update");
		}
		return true;
	}

	@Override
	public boolean updateEamil(String email) {
		if(email!=null) {
			System.out.println("you can update the data");
			boolean update2=this.shopping.onUpdateByEmail(email);
			System.out.println(update2);
		}else {
			System.out.println("you cant update");
		}
		return true;
	}

	@Override
	public boolean deleteId(int id) {
		if(id!=0) {
			System.out.println("you can delete the data");
			boolean delete=this.shopping.onDeleteById(id);
			System.out.println(delete);
		}else {
			System.out.println("you cant delete");
		}
		return true;
	}

	@Override
	public boolean deleteEmail(String email) {
		if(email!=null) {
			System.out.println("you can delete the data");
			boolean delete1=this.shopping.onDeleteByEmail(email);
			System.out.println(delete1);
		}else {
			System.out.println("you cant delete1");
		}
		return true;
	}
	@Override
	public boolean readName(String name) {
		if(name!=null) {
			System.out.println("you can read the data");
			boolean read=this.shopping.onReadByName(name);
			System.out.println(read);
		}else {
			System.out.println("you cant read");
		}
		return true;
	}
	@Override
	public boolean readEmail(String email) {
			if(email!=null) {
			System.out.println("you can read the data");
			boolean read=this.shopping.onReadByEmail(email);
			System.out.println(read);
		}else {
			System.out.println("you cant read");
		}
		return true;
	}

}
