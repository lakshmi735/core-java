package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTester {
	public static void main(String[] args) {
		Set set= new HashSet();
		set.add("Zebra");
		set.add("Giraffe");
		
		System.out.println("Fetching data using for each");
		for (Object object : set) {
			System.out.println(object);
			
		}
		System.out.println("Fetching data using Iterator");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{   
			
			String obj=(String)itr.next(); //down casting if all data are one data type
			System.out.println(obj);
		}
	}

}
