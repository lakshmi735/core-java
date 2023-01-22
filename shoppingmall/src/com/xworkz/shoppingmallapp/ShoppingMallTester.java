package com.xworkz.shoppingmallapp;

import java.util.Scanner;

import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;
import com.xworkz.shoppingmallapp.shops.Shops;

public class ShoppingMallTester {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ShoppingMall mall=new ShoppingMall(size);
		System.out.println("Enter The Size");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			Shops shop=new Shops();
			System.out.println("Enter the Shop Id");
			
			shop.setShopId(sc.nextInt());
			System.out.println("Enetr the Shop Name");
			shop.setShopName(sc.next());
			
			System.out.println("Enetr The Shop Address");
			shop.setAddress(sc.next());
			
			System.out.println("Enter the Shop Contact Number");
			shop.setContactNo(sc.nextLong());
			
			mall.addShop(shop);
			
		}
		sc.close();
	}

}
