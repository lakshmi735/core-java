package com.xworkz.java8featuresapp;

public class DivisionTester {
	public static void main(String[] args) {
		Divison division=(num1,num2)->{
			System.out.println("start of method");
			System.out.println(num1/num2);
			System.out.println("end of method");
		};
		division.div(25, 5);
	}

}
