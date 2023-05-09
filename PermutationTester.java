package com.xworksz.examples;

import java.util.Scanner;

public class PermutationTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Factorial factorial=new Factorial();
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("Enter the value r");
		int r=sc.nextInt();
		if(number>=r)
		{
		int permutation=factorial.findFact(number)/factorial.findFact(number-r);
		int permutation1=factorial.findFact(number)/(factorial.findFact(number-r)*(factorial).findFact(r));
			System.out.println("the permutation of " + number + " is " +permutation);
			System.out.println("the permutation of " + number + " is " +permutation1);
}
}
}//n!/(n-r)!
//n!/(n-r)!*r!