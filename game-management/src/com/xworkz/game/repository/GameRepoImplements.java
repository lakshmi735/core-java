package com.xworkz.game.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.game.dto.GameDTO;

public class GameRepoImplements implements GameRepo {
	String query;
	
	public GameRepoImplements()
	{
		System.out.println("CricketRepoImplementation");
	}
	public GameRepoImplements(String query) {
		this.query=query;
	
	}
	@Override
	public boolean onSave(GameDTO dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/games\",\"root\",\"Xworkzodc@123");
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getGameName());
			statement.setInt(3, dto.getNo_of_players());
			statement.setInt(4, dto.getNo_of_team());
			statement.setString(5, dto.getPlace());
			statement.setString(6, dto.getGame_start());
			statement.setString(7, dto.getGame_end());
			statement.setInt(8, dto.getNo_of_games());
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
