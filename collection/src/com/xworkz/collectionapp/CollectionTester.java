package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTester {
	public static void main(String[] args) {
		Collection list=new ArrayList();   //Treeset //Hashset
		list.add("Baba");
		list.add(123434445L);
		list.add("seetha");
		list.add(123);
		list.add('A');
		list.add(8956238956L);
		list.add("rohith");
		list.add('Z');
		list.add(45);
		list.add("Bangalore");
		list.add(2);
		list.add(56);
		list.add('T');
		list.add("Dhruvit");
		list.add(45);
		list.add('L');
		list.add("mangalore");
		list.add(67);
		list.add('p');
		list.add(10);
		list.add(15);
		list.add("India");
		list.add("Karnataka");
		list.add("Rajajinagar");
		list.add(12);
		list.add(75);
		list.add(6);
		list.add('y');
		list.add('M');
		list.add("Tuffy");
		list.add(99);
		System.out.println(list.contains("hasan"));
		System.out.println(list);
		list.add("seetha");
		System.out.println(list.contains("Bangalore"));
		System.out.println("the size of collection before using remove is " + list.size());
		System.out.println(list.remove("seetha"));
		System.out.println("the size of collection after using remove is " + list.size());
		System.out.println(list.isEmpty());
	
		System.out.println(list);
	}
	

}
