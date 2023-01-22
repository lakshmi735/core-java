package railwaystationapp;

import java.util.Scanner;

import railwaystationapp.platform.Platform;
import railwaystationapp.railwaystation.RailwayStation;

public class RailwayStationTester {

	public static void main(String a[])
	{
		System.out.println("the main method is started");
		
           Scanner scanner=new Scanner(System.in);  //Scanner
		
		System.out.println("Enter the size");
		int size= scanner.nextInt();
		RailwayStation railway=new RailwayStation(size);
		for(int i=0;i<size;i++)
		{
			Platform platform=new Platform();
		System.out.println("Enter the platform Id");
	    platform.setPlatformId(scanner.nextInt());
		System.out.print("Enter the platform Name");
	    platform.setPlatformName(scanner.next());
	    System.out.println("Enter the platform No");
		platform.setPlatformNo(scanner.nextInt());
		
		
		
		
		railway.include(platform);
		//railway.getPlatform();
		}
		
		System.out.println("Enter 1 to fetch all the platform");
		System.out.println("Enter 2 to fetch platfrom by id");
		
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
			railway.getPlatform();
			break;
		case 2:
			System.out.println("Enter id to fetch plaform");
			int id=scanner.nextInt();
			railway.getPlatfromByPaltformId(id);
			break;
			
		}
		System.out.println("the main method is ended");
		scanner.close();
		
	}
	}

