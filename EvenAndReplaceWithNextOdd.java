package com.xworksz.examples;

public class EvenAndReplaceWithNextOdd {
	public static void main(String[] args) {
		int a[]= {12,45,23,6,12,79,345,87,56,26,28};
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number");
				int temp=a[i];
				System.out.println("the odd number " + a[i] + "is");
				
			}
			else
			{
				System.out.println("odd number");
			}
		}

	}

}
