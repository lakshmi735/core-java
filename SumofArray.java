package com.xworksz.examples;

public class SumofArray {
	public static void main(String ag[])
	{
		int a[]= {12,45,23,6,12,79,345,87,56,26,28};
		int sum=0 ,prod =1 ;
		for(int i=0;i<a.length;i++)
		{    //sum=sum+nextNo
			sum=sum+a[i];//0+1,1+2,2+3
			prod=prod*a[i];
		}
		
		System.out.println(" sum of all " + sum);
		System.out.println("product of array "+prod);

}
}