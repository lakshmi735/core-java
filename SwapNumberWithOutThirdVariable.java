package com.xworksz.examples;

import java.util.Scanner;

public class SwapNumberWithOutThirdVariable {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping " + " a " + a + " b " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping " + " a " + a + " b " + b);
		sc.close();
	}

}
