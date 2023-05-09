package com.xworksz.examples;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int x;
		int y;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and y values");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping "+ " x= "+  x + " y= " + y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swapping " + " x= " + x + " y= " + y);
		sc.close();
		
		
		
	}


}
