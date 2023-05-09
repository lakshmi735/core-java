package com.xworkz.wedding.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.xworkz.wedding.dto.WeddingDTO;

public class WeddingRepoImplemets implements WeddingRepo {
	String query;
	
	public WeddingRepoImplemets() {
		System.out.println("WeddingRepoImplemets");
	}
	public WeddingRepoImplemets(String query) {
		this.query=query;
	}

	@Override
	public boolean onSve(WeddingDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getPlace());
			statement.setString(3, dto.getDecoration());
			statement.setInt(4, dto.getDate());
			statement.setString(5, dto.getDay());
			int i=statement.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully");
			}else {
				System.out.println("data not saved");
			}
			}catch (Exception e) {
				System.out.println("classnotfound");
			}
			
			return true;
	}
	@Override
	public boolean onUpdate(int id) {
		try {
			System.out.println("inside update method");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			String query ="update wedding set day=? where id =?";
			//Statement st=con.createStatement();
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(2,id );
		    stmt.setString(1, "sunady");
		 
			int i= stmt.executeUpdate();
			if(i!=0) {
				System.out.println("updated");
				
			}
			else {
				System.out.println("not updated");
			}
		}catch(Exception e) {
				e.printStackTrace();
		}
			return true;
		}
	@Override
	public boolean onDelete(int id) {
		try {
			System.out.println("inside delete method");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			String query ="delete from wedding where place=?";
			PreparedStatement statement=con.prepareStatement(query);
			statement.setString(1, "titan");
			int i= statement.executeUpdate();
			if(i!=0) {
				System.out.println("deleted");
				
			}
			else {
				System.out.println("not deleted");
			}
		}catch(Exception e) {
				e.printStackTrace();
		}
			return true;
		}
}
	
			
	
	


