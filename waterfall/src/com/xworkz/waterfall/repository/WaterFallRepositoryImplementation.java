package com.xworkz.waterfall.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.waterfall.dto.WaterFallDTO;

public class WaterFallRepositoryImplementation implements WaterFallRepository {
	
	String query;
	public WaterFallRepositoryImplementation() {
		System.out.println("WaterFallRepositoryImplementation");
	}
	public WaterFallRepositoryImplementation(String query) {
	
		this.query=query;
	}
	@Override
	public boolean onSave(WaterFallDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getPlace());
			statement.setString(4, dto.getHeight());
			int i=statement.executeUpdate();
			if(i!=0) {
				System.out.println("data saves succefully");
			}else {
				System.out.println("data not saved");
			}
		}catch (Exception e) {
				e.printStackTrace();
			}
		return true;
	}
	
}

