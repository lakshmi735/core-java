package com.xworksz.examples;

import java.util.Scanner;

public class FactorialTester
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Factorial factorial=new Factorial();
		System.out.println("Enter the value of factorial n");
		int n =sc.nextInt();
		if(n>0)
		{
			int fact=factorial.findFact(n);
		
		System.out.println("the value of n factorial "+ n + " is " + fact);
	}
	}

}
