package com.xworksz.examples.reverse;

public class ArrayOperation {
	public static void main(String args[])
	{
		int a[]= {23,45,12,56,67,89,10};
		
	
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			int count=0;    //count=1
		for(int j=1;j<=a[i];j++)    //j=2
		{
		if(a[i]%j==0)
		{
			count=count+1;
		}
		}
		//System.out.println(count);
		if(count!=2)
		{
			System.out.println("not a prime");
		}
			else
			{
				System.out.println(" prime");
		}
	}
		 
	}
}


