package com.xworkz.java8featuresapp;

public class MultiplicationTester {
	public static void main(String[] args) {
		Multiplication multiplication=(num1,num2)->{
			System.out.println("start of method");
			System.out.println(num1*num2);
			System.out.println("end of method");
		};
		multiplication.mul(45, 23);
	}

}
