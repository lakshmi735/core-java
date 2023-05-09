package com.xworksz.examples;

public class OddOrEven2 {

	public static void main(String a[]) {
		
		for(int i=0;i<50;i++)
		{
			if(i%2==0)
			{
				
				System.out.println("the even number are:->"+i);
		
			}
			else
			{
				System.out.println("the odd number are");
				System.out.println(i);
			}
		}
	}
} //range/in 1 to 50 we have to check only even number(range means we have  to use for loop)
