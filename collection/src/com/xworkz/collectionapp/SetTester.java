package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.LinkedHashSet;

import java.util.Set;
import java.util.TreeSet;

public class SetTester {
	public static void main(String[] args) {
		
		//Object PRESENT=new Object();
		//Object obj=null;
		//System.out.println(PRESENT==null);
		
		Set set=new HashSet();
		
		
		set.add("baba");
		set.add("Zebra");
		set.add(null);
		set.add("Bangalore");
		set.add('D');
		set.add("baba");
		set.add("zebra");
		set.add(null);
		set.add(1);
		
		System.out.println(set);
		
		LinkedHashSet set1=new LinkedHashSet();
		
		set1.add("baba");
		set1.add("Zebra");
		set1.add(null);
		set1.add("Bangalore");
		set1.add('D');
		set1.add("baba");
		set1.add("zebra");
		set1.add(null);
		
		System.out.println(set1);
		
System.out.println(set);
		
		TreeSet tree=new TreeSet();
		
		tree.add("baba");
		tree.add("Zebra");
		//tree.add(null);
		tree.add("Bangalore");
		//tree.add('D');
		tree.add("baba");
		tree.add("zebra");
		//tree.add(null);
		
		
		System.out.println(tree);
		
	}

}
//it display the data in random way