package com.xworksz.examples;

public class Factorial {
		public int findFact(int number)
		{
			int fact=1;
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
			}
			return fact;
		}
		
}
