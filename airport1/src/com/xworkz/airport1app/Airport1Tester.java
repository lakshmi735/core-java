package com.xworkz.airport1app;

import java.util.Scanner;

import com.xworkz.airport1app.airport.Airport1;
import com.xworkz.airport1app.terminal.Terminal;

public class Airport1Tester {
	public static void main(String a[])
	{
		System.out.println("the main method is started....");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		Airport1 airport=new Airport1(size);
		for(int i=0;i<size;i++)
		{
			Terminal terminal=new Terminal();
			System.out.println("enter the Id");
			terminal.setTerminalId(scanner.nextInt());
			System.out.println("Enetr the Terminal name");
			terminal.setTerminalName(scanner.next());
			System.out.println("Enter the Terminal Number");
			terminal.setNoOfGate(scanner.nextInt());
		
			
		
		airport.add(terminal);
		
		//airport.getTermainal();
		}
		System.out.println("Enter 1 fetch all the Terminals");
		System.out.println("Enter 2 fetch teminal by id");
		
		int option=scanner.nextInt();
		switch(option)
		{
		case 1:
			airport.getTermainal();
			break;
		case 2:
			System.out.println("Enter id to fetch to terminal");
			int id=scanner.nextInt();
			airport.getTerminalByTerminalId(id);
			break;
		}
		System.out.println("the main method is ended....");
		scanner.close();
	}

}
