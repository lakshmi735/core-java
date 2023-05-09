 package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListTerster {
	public static void main(String[] args) {
		Set<CustomerTester> customer = new TreeSet<CustomerTester>();
		customer.add(new CustomerTester(1,"lakshmi","Bangalore","lakshmi@gamil.com"));
		
		Iterator<CustomerTester> itr = customer.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}

}
