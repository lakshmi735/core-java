package com.xworkz.collectionapp;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTester1 {
	
	public static void main(String[] args) {
		List list=new Vector();
		list.add('A');
		list.add(1,"Ravish");
		list.add(2,"Banglore");
		list.add(3);
		list.add("java");
		
		
		List list1=new Stack();
		list1.add('B');
		list1.add(1,"Ranjitha");
		list1.add(2,"Karnataka");
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list.addAll(list1));
		
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list.contains('A'));
		System.out.println(list);
		System.out.println(list.containsAll(list1));
		System.out.println(list);
		//System.out.println(list1);
		
	}
	

}
