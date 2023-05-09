package com.xworkz.java8featuresapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringEquals {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("bangalore");
		list.add("mysore");
		list.add("thumkur");
		list.add("bidadhi");
		list.add("bangalore"); 
		list.add("rajajinagar");
		list.add("basweshwaranagar");
		list.add("mysore");
		list.add("rrnagar");
		list.add("banashankri");
		
		System.out.println(list);
		List<String> value=list.stream().filter(ref -> ref.equals("bangalore")).collect(Collectors.toList());
		System.out.println(value);
		
	}

}
