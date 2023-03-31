package com.xworkz.shoppingrepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.shoppingDTO.ShopDTO;

public class ShopRepoImplements implements ShopRepo{
	String query;
	public ShopRepoImplements() {
		System.out.println("This is ShopRepoImplements");
	}
	public ShopRepoImplements(String query) {
		this.query=query;
	}

	@Override
	public boolean onSave(ShopDTO dto) {
		System.out.println("This is onSave method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, dto.getId());
		st.setString(2, dto.getName());
		st.setString(3, dto.getEmail());
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data save succefully");
		}
		else {
			System.out.println("data not saved");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onRead(int id) {
		System.out.println("This is onRead method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			
			String query="select * from shopping_jdbc where id=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, id);
			ResultSet rt=st.executeQuery();
			while(rt.next()) {
				System.out.println("id:"+rt.getInt(1)+" "+"name:"+rt.getString(2)+" "+"email:"+rt.getString(3));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean onUpdateById(int id) {
		System.out.println("This is onUpdate method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		String query="update shopping_jdbc set name=? where id=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, "barathi");
		st.setInt(2, 1);
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data update succefully");
		}
		else {
			System.out.println("data not update");
		}
		}catch (Exception e) {
			System.out.println("ClassNotFound");
		}
		return true;
	}

	@Override
	public boolean onUpdateByName(String name) {
		System.out.println("This is onUpdateByName method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		String query="update shopping_jdbc set email=? where name=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, "barath123@gmail.com");
		st.setString(2, "barathi");
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data update succefully");
		}
		else {
			System.out.println("data not update");
		}
		}catch (Exception e) {
			System.out.println("ClassNotFound");
		}
		return true;
	}

	@Override
	public boolean onUpdateByEmail(String email) {
		System.out.println("This is onUpdateByEmail method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		String query="update shopping_jdbc set name=? where email=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(2, "vinod@gmail.com");
		st.setString(1, "vinodh kumar");
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data update succefully");
		}
		else {
			System.out.println("data not update");
		}
		}catch (Exception e) {
			System.out.println("ClassNotFound");
		}
		return true;
	}

	@Override
	public boolean onDeleteById(int id) {
		System.out.println("This is onDeleteById method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		String query="delete  from shopping_jdbc where id=? ";
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1, 4);
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data deleted succefully");
		}
		else {
			System.out.println("data not delete");
		}
		}catch (Exception e) {
			System.out.println("ClassNotFound");
		}
		return true;
	}


	@Override
	public boolean onDeleteByEmail(String email) {
		System.out.println("This is onDeleteByEmail method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
		String query="delete from shopping_jdbc where email=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, "chetan@gmail.com");
		
		int i=	st.executeUpdate();
		if(i!=0) {
			System.out.println("data deleted succefully");
		}
		else {
			System.out.println("data not delete");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean onReadByName(String name) {
		System.out.println("This is onReadByName method");
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			
			String query="select * from shopping_jdbc where name=?";
			
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,name);
			
			ResultSet rt=st.executeQuery();
			while(rt.next()) {
				
				System.out.println("id:"+rt.getInt(1)+" "+"name:"+rt.getString(2)+" "+"email:"+rt.getString(3));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean onReadByEmail(String email) {
		System.out.println("This is onReadByEmail method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Xworkzodc@123");
			
			String query="select * from shopping_jdbc where email=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,email);
			ResultSet rt=st.executeQuery();
			while(rt.next()) {
				System.out.println("id:"+rt.getInt(1)+" "+"name:"+rt.getString(2)+" "+"email:"+rt.getString(3));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}