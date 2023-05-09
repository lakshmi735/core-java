package com.xworksz.examples;

public class CountNumber {
	public static void main(String a[])
	{
		int countNumber=0;
		int num=12345;
		
		{
	       while(num!=0)  //or while(num>0)
			{
	    	   num=num/10; //remove last digits of number
				System.out.println(num);
				
				countNumber++;
			}
	   
		}
		      //print the count
		System.out.println("the count of the number is"+countNumber);
	}

}
//Program to count number of digits in an given integer
//num:12345
//count:0

//Iteration:1
//while condition(num!=0) 12345!=0 is true
//num:1234
//count:1

//After the first iteration num will divided by 10 and its value will be 1234 the count is incremented to 1

//Iteration:2
//while condition(num!=0) 1234!=0 is true
//num:123
//count:2

//Iteration:3
//while condition(num!=0) 123!=0 is true
//num:12
//count:3

//Iteration:4
//while condition(num!=0) 12!=0 is true
//num:1
//count:4

//Iteration:5
//while condition(num!=0) 1!=0 is true
//num:0
//count:5

//Iteration:6
//while condition(num!=0) 0!=0 is false
//num:0
//count:5      then the test expression is evaluated to false and the loop terminates