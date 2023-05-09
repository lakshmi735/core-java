package com.xworksz.examples;

public class ReverseArrayElement {
	public static void main(String[] args) {
		int a[]= {12,45,23,6,12,79,345,87,56,26,28};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("       ");
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}
