package com.xworkz.encapsulationapp;

import java.util.Scanner;


import com.xworkz.encapsulationapp.platform.Platform;

public class RailwayStationTester {
	
	public static void main(String[] args) {
		System.out.println("the  Main Method Started....");
		Scanner sc=new Scanner(System.in);
		Platform platform=new Platform();
		System.out.println("Enter the Platform Id");
		platform.setPlatformId(sc.nextInt());
		
		System.out.println("Enter the Platfrom Name");
		platform.setPlatformName(sc.next());
		
		System.out.println("Enter the Platform Number");
		platform.setPlatformNumber(sc.nextInt());
		
		System.out.println(platform.getPlatformId()+ " " +platform.getPlatformName() +  " " +platform.getPlatformNumber());
		sc.close();
		System.out.println("the  Main Method ended....");
	}

}
