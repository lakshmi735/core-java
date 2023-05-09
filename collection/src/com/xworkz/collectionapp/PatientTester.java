package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatientTester {
	public static void main(String[] args) {
		
		List<Patient> list=new ArrayList<Patient>();
		list.add(new Patient(1,"anvitha","RR nagar",8956238956L));
		list.add(new Patient(2,"Dhanu","Basaweshwara nagar",865238956L));
		list.add(new Patient(3,"Pavithra","Kormanagala",8956238956L));
		list.add(new Patient(4,"Sonu","Basawangudi",8956238956L));
		list.add(new Patient(5,"Karthik","Rjajai nagar",8956238956L));
		
		Iterator<Patient> itr = list.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
	}

}
