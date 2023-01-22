package com.xworkz.encapsulationapp;

import java.util.Scanner;

import com.xworkz.encapsulationapp.patient.Patient;

public class PatientTester {
	public static void main(String[] args) {
		System.out.println("The Main Method Started...");
		Scanner sc=new Scanner(System.in);
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
		  sc.close();
		  
		  
		  System.out.println("The Main Method Ended...");	
		
	}
	

}
