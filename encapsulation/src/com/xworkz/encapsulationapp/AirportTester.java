package com.xworkz.encapsulationapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.terminal.Terminal;

public class AirportTester {
	public static void main(String[] args) {
		System.out.println("the main method started");
		Scanner sc=new Scanner(System.in);
		Terminal terminal=new Terminal();
		System.out.println("enter the terminal id");
		terminal.setTEminalId(sc.nextInt());
		
		System.out.println("Enter the Terminal Name");
		terminal.setTerminalName(sc.next());
		
		System.out.println("Enter the Number Of Gates");
		terminal.setNoOfGate(sc.nextInt());
		
		System.out.println(terminal.getTerminalId()+ " " +terminal.getTerminalName() + " " +terminal.getNoOfGate());
		sc.close();
				
	}

}
