package com.xworkz.software.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.software.dto.SoftwareDTO;

public class SoftwareRepositoryImplementation implements SoftwareRepository{
	String query;
	
	public SoftwareRepositoryImplementation()
	{
		System.out.println("SoftwareRepositoryImplementation");
	}

	
	public SoftwareRepositoryImplementation(String query){
		this.query=query;
		}
	@Override
	public boolean onSave(SoftwareDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getSoftware_name());
			statement.setString(3, dto.getCompany_name());
			statement.setString(4, dto.getPlace());
			statement.setString(5, dto.getLanguage());
			int i= statement.executeUpdate();
			if(i!=0) {
				System.out.println("data saved successfully");
				
			}else {
				System.out.println("data not saved");
			}
		}catch (Exception e) {
			//System.out.println("ClassNotFound");
			e.printStackTrace();
		}
		return true;
	}


	@Override
	public boolean onRead(int id) {
		System.out.println("this on read method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			String query="select * from software1 where id=?"; 
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("id:"+rs.getInt(1)+" "+"name:"+rs.getString(2));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}


	@Override
	public boolean onUpdate(int id) {
		try {
			System.out.println("inside update method");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			String query ="update software1 set company_name=? where id=id";
			PreparedStatement st=con.prepareStatement(query);
			//String company="ABC";
			//int id1=id;
			
			st.setString(1, "ABC");
			st.setInt(2, 1);
			int i= st.executeUpdate();
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
		 System.out.println("this is on delete");
		try {
			System.out.println("inside delete method");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Xworkzodc@123");
			String query ="delete from software1 where id=?";
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, id);
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
	