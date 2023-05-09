package com.xworkz.collectionapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class GenericsTester {
	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Bangalore");
		queue.add("Kiran");
		queue.add("Karnataka");
		//System.out.println(queue);
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			//itr.remove();
			System.out.println(obj);
		}
		
		Set<Integer> set= new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		//System.out.println(set);
		Iterator itr1=set.iterator();
		while(itr1.hasNext())
		{
			Object obj1=itr1.next();
			System.out.println(obj1);
		}
	}

}
