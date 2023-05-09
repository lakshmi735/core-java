package com.xworksz.examples;



public class Fibonnacci {
	public static void main(String[] args) {
		int num =10;
		int n1=0;
		int n2=1;
		int n3 = 0;
		
		
		if(num>0)
		{
			for(int i=1;i<num;i++)
			{
				System.out.println(n3 + " ");
				n1=n2;
				n2=n3;
				n3=n1+n2;
			}
		}
	}

}
