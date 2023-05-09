package com.xworkz.java8featuresapp;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ManagerTester {
	public static void main(String[] args) {
		
		List<ManagerDTO> manager = new ArrayList<ManagerDTO>();
		
		
		manager.add(new ManagerDTO(1,"kiran","MBA",70000));
		manager.add(new ManagerDTO(2,"vinay","M.com",35000));
		manager.add(new ManagerDTO(3,"anvitha","Btech",65000));
		manager.add(new ManagerDTO(4,"anusha","MSC",25000));
		
		System.out.println("maximum salary is");
		System.out.println(manager.stream().max(Comparator.comparing(ManagerDTO::getSalary)));
		System.out.println("minimum salary is");
		System.out.println(manager.stream().min(Comparator.comparing(ManagerDTO::getSalary)));
		
	System.out.println(manager.stream().sorted(Comparator.comparing(ManagerDTO::getSalary).reversed()).collect(Collectors.toList()));
	System.out.println(manager.stream().sorted(Comparator.comparing(ManagerDTO::getId)).collect(Collectors.toList()));
	System.out.println(manager.stream().sorted(Comparator.comparing(ManagerDTO::getName)).collect(Collectors.toList()));
	System.out.println("salary less than 50000");
	System.out.println(manager.stream().filter(value->value.getSalary()<50000).collect(Collectors.toList()));
	System.out.println(manager.stream().sorted((man1,man2)-> man1.getId()).collect(Collectors.toList()));
	
	}


}
