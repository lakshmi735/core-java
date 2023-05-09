package com.xworksz.examples;

public class EvenCount {
	public static void main(String a[])
	{
		int evenCount=0,oddCount=0;//in instance variables there is no default value we need to assign 
		for(int i=0;i<55;i++)
		{
			if(i%2==0)
			{
				evenCount+=1;//evenCount=evenCount+1;
			}
			else
			{
				oddCount+=1;
			}
		}
		System.out.println("even count"+evenCount);
		System.out.println("odd count"+oddCount);
	}
	
}
//even and odd numbers