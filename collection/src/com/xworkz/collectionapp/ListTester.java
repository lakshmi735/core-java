package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class ListTester {
	public static void main(String[] args) {
		List list=new ArrayList();
		/*list.add("anvitha");
		list.add(null);
		list.add(2,"ajay");
		list.add(null);
		list.add("anvitha");
		list.add("sonu");*/
		/*System.out.println(list.remove(1));
		System.out.println(list.get(4));
		*/
		list.add(0,1);
		list.add(1,"ajay");
		list.add(2,"bhavana");
		list.add(3,6);
		list.add('A'); //allow null value but only one null value
		for(Object obj : list)
		{
			//list.add("Hello");//ConcurrentModificationException--->we can't add(modify) data while fetching 
			//list.add(4,"hello"); 
			System.out.println(obj);
		}
		System.out.println(list);
	}

}
