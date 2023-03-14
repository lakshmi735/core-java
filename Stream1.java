package com.xworkz.java8featuresapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(445);
		list.add(167);
		list.add(78);
		list.add(246);
		list.add(10);
		list.add(22);
		list.add(557);
		list.add(86);
		list.add(437);
		list.add(765);
		list.add(54);
		list.add(654);
		list.add(43);
		list.add(65);
		list.add(675);
		list.add(15);
		list.add(9);
		list.add(346);
		
		System.out.println("list of data using Iterator");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			Integer value=itr.next();
			if(value>100)
			{
				System.out.println(value);
			}
		}
		System.out.println("lilst of data using Stream");
		List<Integer> integer=list.stream().filter(value -> (value<100)).collect(Collectors.toList());
		System.out.println(integer);
		list.stream().forEach(value -> System.out.println(value));
	}

	
}
