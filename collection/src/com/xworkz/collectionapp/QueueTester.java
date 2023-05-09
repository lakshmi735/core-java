package com.xworkz.collectionapp;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTester {
	public static void main(String[] args) {
		Queue set=new PriorityQueue();
		set.add("git");
		set.add("jira");
		set.add("bangalore");
		set.add("apple");
		set.add("navya");
		//set.add(null);   //does not allow null value in Queue
		System.out.println("Fetching data using for each");
		for (Object object : set) {
			System.out.println(object);
			
		}
		System.out.println("Fetching data using Iterator");
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{   
			Object obj=itr.next();
			//String obj=(String)itr.next(); //down casting if all data are one data type
			System.out.println(obj);
		}
	}

}
