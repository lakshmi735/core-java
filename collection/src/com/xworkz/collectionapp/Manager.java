package com.xworkz.collectionapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Manager {
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String address;
	private String email;

}
