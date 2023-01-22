package com.xworkz.encapsulationapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.manager.Manager;

public class ManagerTester {
	 public static void main(String[] args) {
		 System.out.println("the Main Method Started....");
		 Scanner sc=new Scanner(System.in);
		 Manager manager=new Manager();
		    System.out.println("Enter the Manager Id");
			int managerId =sc.nextInt()  ; 
			manager.setManagerId(managerId);
			System.out.println("Enter the Manager Name ");
			manager.setManagerName(sc.next());
			System.out.println("Enter the Manager Address ");
			manager.setAddress(sc.next());
			System.out.println("Enter the Manager Qualification");
			manager.setQualification(sc.next());
			System.out.println("Enter the Manager gender");
			manager.setGender(sc.next());
			
			System.out.println(manager.getManagerId() + " " +manager.getManagerName() + " " +manager.getAddress() + " " + manager.getQualification() + " " +manager.getGender());
			 sc.close();
	}
      
}
