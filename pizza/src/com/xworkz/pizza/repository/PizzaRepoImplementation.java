package com.xworkz.pizza.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaRepoImplementation implements PizzaRepo{
	
	String query;
	
	public PizzaRepoImplementation() {
		System.out.println("PizzaRepoImplementation");
	}
	public PizzaRepoImplementation(String query) {
		this.query=query;
	}

	

	@Override
	public boolean onSave(PizzaDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getShopName());
			statement.setString(3, dto.getLocation());
			statement.setLong(4, dto.getContactNo());
			statement.setString(5, dto.getEmail());
			
			int i= statement.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully");
				
			}else {
				System.out.println("data not saved");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
