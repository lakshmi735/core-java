package com.xworksz.examples.test;

public class ReveseSentence {
	public static void main(String a[])
		{
			String city="hello welcome to bangalore";
			
			int count=0;
			String ch[]=city.split(" ");
			for(int i=ch.length-1;i>=0;i--)
			{
				count++;
				System.out.println(ch[i]);
			}
			System.out.println("the count of the word is:"+count);
		}
	}



