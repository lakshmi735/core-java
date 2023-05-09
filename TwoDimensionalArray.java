package com.xworksz.examples;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int twod[][]= {{12,34,3,5,8,78},{12,20,5,19,34}};
		for(int i=0;i<twod.length;i++)   //how many arrays-->2 array
		{
			System.out.println("length of first array " +twod[i].length);
			for(int j=0;j<5;j++)//how many elements in array
			{
				
				System.out.println(twod[i][j]);
			}
		}
	}

}


