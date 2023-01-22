package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.shops.Shops;

public class ShoppingMall {
	
	Shops shop[];
	int index;
	
	public ShoppingMall(int size) {
		System.out.println(" object created");
		shop=new Shops[size];
	}
	
	public boolean addShop(Shops shops)
	{
		System.out.println("addShop method started...");
		boolean isShopAdded = false ;
		if(shops.getShopName()!=null)
		{
			this.shop[index++]=shops;
			isShopAdded=true;
		}
		System.out.println("end of addShop method");
		return isShopAdded;
	}
	public void getAllShops()
	{
		System.out.println("getAllShops method started....");
		for(int i=0;i<shop.length;i++)
		{
			System.out.println(shop[i].getShopId() + " " +shop[i].getShopName() + " " +shop[i].getAddress() + " " +shop[i].getContactNo());
			
		}
		System.out.println("end of getAllShop method");
	}
	

}
