package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.apollohospital.ApolloHospital;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester 

{         
	public static void main(String a[])
	{
		
		System.out.println("The Main Method Started...");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Hospital hospital=new ApolloHospital(size);
		ApolloHospital apollo= (ApolloHospital) hospital;
		for(int i=0;i<size;i++)
		{
			Patient patient=new Patient();
		  System.out.println("Enter the Patient Id");
		  patient.setPatientId(sc.nextInt());
		  
		  System.out.println("Enter the patient Name");
		  patient.setPatientName(sc.next());
		  
		  System.out.println("Enter the Address of the Patient");
		  patient.setPatientAddress(sc.next());
		  
		  System.out.println("Enter the Age of the Patient");
		  patient.setPatientAge(sc.nextInt());
		  
		  System.out.println("Enter the Contact Number of the Patient");
		  patient.setPatientContactNumber(sc.nextLong());
		  
		  System.out.println(patient.getPatientId() + " " +patient.getPatientName() + " " +patient.getPatientAddress() + " " +patient.getPatientContactNumber()+ " " +patient.getPatientAge());
		  
		  hospital.admit(patient);
		  
		  
		}
		
		
		//hospital.admit(patient);
		//hospital.getAllPatients();
		apollo.canteen();
		
		//int option;
		String answer ="yes";
		
		do {
		System.out.println("Enter 1 to fetch all the patient");
		System.out.println("Enter 2 to fetch patient by id");
		System.out.println("Enter 3 to update patient by patient name");
		System.out.println("Enter 4 to exit");
		int option=sc.nextInt(); //option=sc.nextInt();
		
		
		switch(option)
		{
		case 1:hospital.getAllPatients();
		break;
		case 2:
			System.out.println("Enter the ide to be fetched");
			int id=sc.nextInt();
			hospital.getPatientByPatientId(id);
			break;
		case 3:
			System.out.println("Enter the updated age ");
			int updateAge=sc.nextInt();
			System.out.println("Enter the patient name");
			String name=sc.next();
			hospital.updatePatientAgeByPatientName(updateAge, name);
			break;
		case 4:
			System.out.println("thank you for visting");
			break;
		default:
			System.out.println("please Enter the valid number");
		
		}
		System.out.println("do you want to continue yes or no");
		//answer=sc.next();
		}while(answer.equals(sc.next())); //while("Yes".equals(answer));
			System.out.println("The Main Method Ended...");	
		    sc.close();
	}
}





