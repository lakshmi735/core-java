package com.xworkz.java8featuresapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("bangalore");
		list.add("mysore");
		list.add("aba");
	;
		
		List<String> value=list.stream().filter(stringValue -> (stringValue.length()>4)).collect(Collectors.toList());
		System.out.println(value);
		
	}

}
