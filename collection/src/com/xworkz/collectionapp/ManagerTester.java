package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ManagerTester {
	public static void main(String[] args) {
		
		List<Manager> list = new Vector<Manager>();
		list.add(new Manager(1,"Ragu","RT nagar","ragu@gmail.com"));
		list.add(new Manager(2,"Tanu","Rajaji nagar","tanu@gmail.com"));
		list.add(new Manager(3,"Bhanu"," BTM lyout","bhanu@gmail.com"));
		list.add(new Manager(4,"Manu","Navarang","manu@gmail.com"));
		list.add(new Manager(5,"Chetan","Mejestic","chetan@gmail.com"));
		
		
	    Iterator<Manager> itr = list.iterator();
	    while(itr.hasNext())
	    {
	    	Object obj = itr.next();
	    	System.out.println(obj);
	    }
	}

}
