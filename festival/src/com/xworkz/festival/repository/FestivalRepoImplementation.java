package com.xworkz.festival.repository;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.festival.dto.FestivalDTO;

public class FestivalRepoImplementation implements FestivalRepo{
String query;
	
	public FestivalRepoImplementation()
	{
		System.out.println("CricketRepoImplementation");
	}
	public FestivalRepoImplementation(String query) {
		this.query=query;
	
	}
	


	@Override
	public boolean onSave(FestivalDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getFastivalName());
			statement.setString(3, dto.getDecoration());
			statement.setString(4, dto.getSweet());
			statement.setString(5, dto.getPlace());
			
			int i=statement.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully");
			}else {
				System.out.println("data not saved");
			}
			
			}catch (Exception e) {
				System.out.println("classNotFoundException");
			}
		
		return true;
	}
	}
