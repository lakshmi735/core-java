package com.xworksz.examples.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=15;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
		if(count==2)
		{
			System.out.println("the number is prime number "+ num);
		}
		else
		{
			System.out.println("the number is not prime number"+num);
		}
	}

}
