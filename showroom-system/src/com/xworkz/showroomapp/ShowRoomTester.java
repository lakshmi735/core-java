package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.ShowRoom;

public class ShowRoomTester {
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		Scanner sc=new Scanner(System.in);  //Scanner
		
		System.out.println("Enter the size");
		int size= sc.nextInt();
		ShowRoom showroom=new ShowRoom(size);
		Manager manager=new Manager();
		for(int i=0;i<size;i++)
		{
		System.out.println("Enter the Manager Id");
		manager.setManagerId(sc.nextInt());
		
		System.out.print("Enter the Manager Name");
		manager.setManagerName(sc.next());
		
		 System.out.println("Enter the Contact Number of Manager");
	    manager.setContactNumber(sc.nextLong());
	    
	    System.out.println("Enter the Qualification");
	    manager.setQualification(sc.next());
	    
	    System.out.println("Enter the Gender");
	    manager.setGender(sc.next());
	    //sop(manager.getManagerId()+ " " +manager.getManagerName());
		
		//Manager manager=new Manager(managerId,managerName,contactNo,qualification,gender);
	   
		
		//showroom.saveManager(manager);
		}
		////showroom.getAllManager();
		//showroom.getManagerByManagerId(2);
		//showroom.getManagerByManagerName("manisha");
		//showroom.getManagerByGualification("M.com");
		//showroom.updateQualificationByManagerName("M.tech","manisha");
		//showroom.updateContactById(8956235896L, 2);
		//showroom.getAllManager();
		
		System.out.println("Enter 1 to fetch all the manager");
		System.out.println("Enter 2 to fetch manager by id");
		System.out.println("Enter 3 to update patient by patient name");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1: showroom.getAllManager();
		break;
		case 2:
			System.out.println("Enter id to be fetched");
			int id=sc.nextInt();
			showroom.getManagerByManagerId(id);
			break;
		case 3:
			System.out.println("Enter updated qualification");
			String updateQualification=sc.next();
			System.out.println("Enter manager name");
			String name=sc.next();
			showroom.updateQualificationByManagerName(updateQualification, name);
			break;
		}
		
		System.out.println("the main method ended");
		
		sc.close();
	}

}
