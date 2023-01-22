package com.xworkz.theatreapp;

import java.util.Scanner;

import com.xworkz.theatreapp.screen.Screen;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreTester {
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		Scanner scanner=new Scanner(System.in);  //Scanner
		
		System.out.println("Enter the size");
		int size= scanner.nextInt();
		Theatre theatre=new Theatre(size);
		for(int i=0;i<size;i++)
		{
			Screen screen = new Screen();
		System.out.println("Enter the theatre Id");
		screen.setTheatreId(scanner.nextInt());
		System.out.print("Enter the Theatre Name");
	    screen.setTheatreName(scanner.next());
	    System.out.print("Enter the address");
	    screen.setAddress(scanner.next());
	    System.out.println("Enter the screen no");
	    screen.setScreenNo(scanner.nextInt());
		
		
		
		theatre.movie(screen);
		//theatre.getScreen();
		}
		
		System.out.println("Enter 1 to fetch all screen");
		System.out.println("Enter 2 to fetch screen by id");
		
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
			theatre.getScreen();
			break;
		case 2:
			System.out.println("Enter id to be fetched");
			int id=scanner.nextInt();
			theatre.getTheatreByTheatreId(id);
			break;
		}
		System.out.println("main method is ended");
		scanner.close();
	    

}
}
