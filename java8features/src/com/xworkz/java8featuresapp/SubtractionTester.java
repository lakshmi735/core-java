package com.xworkz.java8featuresapp;

public class SubtractionTester {
	public static void main(String[] args) {
		Subtraction subtraction=(num1,num2)->
		{
			System.out.println("start od method");
			System.out.println(num1-num2);
			System.out.println("end of method");
		};
		subtraction.sub(23, 10);
	}

}
