package com.xworksz.examples;

public class PrintDuplicatetArray {
	public static void main(String[] args) {
		int a[]= {2,5,7,3,2,5,1,8,4};
		System.out.println("the duplicate elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	
}
}
