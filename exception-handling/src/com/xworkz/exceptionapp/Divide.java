package com.xworkz.exceptionapp;

public class Divide {
	public static void main(String[] args) {
		System.out.println("main method started");
		divide(1,0);
		System.out.println("main method ended");
		
	}

	private static void divide(int i, int j) {
		
		System.out.println("divide method strated");
		try
		{
			System.out.println(i/j);
		}
		
		catch(ArithmeticException a) {
			System.out.println("cannot divide given number by zero");
			
		}
		System.out.println("divide method ended");
	}
	

}
