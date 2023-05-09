package com.xworksz.examples;

import java.util.Scanner;

public class PrimeAndEvenOdd {
	public static void main(String[] args) {
		System.out.println("mian method ended");
		Scanner scanner=new Scanner(System.in);
		String answer="yes";
		do {
		System.out.println("Enter 1 to prime number");
		System.out.println("Enter 2 to even number");
		System.out.println("enter 3 to odd number");
		int n=scanner.nextInt();
		switch(n)
		{
		case 1:System.out.println("enter the prime number");
		int n1=scanner.nextInt();
		int count=0;
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Square of the prime number");
			int x=n1*n1;
			System.out.println(x);
			
		}
		break;
		case 2:System.out.println("enter the even number");
		int n2=scanner.nextInt();
		if(n2%2==0)
		{
			System.out.println("square of next even number");
			int y=(n2+2)*(n2+2);
			System.out.println(y);
		}
		break;
		case 3:System.out.println("enter the odd number");
		int n3=scanner.nextInt();
		if(n3%2!=0)
		{
			System.out.println("Square of previous odd number");
			int z=(n3-2)*(n3-2);
			System.out.println(z);
		}
		break;
		}
		System.out.println("do you want to continue yes or no");
		
		}while(answer.equals(scanner.next())); 
			System.out.println("The Main Method Ended...");	
		    scanner.close();
	}

}

