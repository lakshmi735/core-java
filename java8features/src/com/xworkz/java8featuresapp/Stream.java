package com.xworkz.java8featuresapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(45);
		list.add(67);
		list.add(278);
		list.add(46);
		//System.out.println("get the max value");
		System.out.println(list.stream().max(Comparator.comparing(Integer:: intValue)));
		
		System.out.println("get the min value");
		System.out.println(list.stream().min(Comparator.comparing(Integer::intValue)));
		
		System.out.println(list.stream().mapToInt(Integer::intValue).max());
		
		System.out.println(list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
		
		System.out.println("list of data using Iterator");
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			
			Integer integerValue=itr.next();
			if(integerValue%2==0)  //even number
			
			System.out.println(integerValue);
		}
		
		System.out.println("list of add using Stream");
		List<Integer>listofEvenNo=list.stream().filter(integerValue -> (integerValue%2==0)).collect(Collectors.toList());
		System.out.println(listofEvenNo);
		list.stream().forEach(integerValue -> System.out.println(integerValue));
		
	}

}
