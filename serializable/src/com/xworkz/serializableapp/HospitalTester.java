package com.xworkz.serializableapp;

import java.util.Scanner;

import com.xworkz.serializableapp.dto.PatientDTO;
import com.xworkz.serializableapp.gender.Gender;
import com.xworkz.serializableapp.hospital.Hospital;
import com.xworkz.serializableapp.hospital.HospitalImpl;




public class HospitalTester {
	public static void main(String[] args) {
		Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			Hospital hp=new HospitalImpl();
			System.out.println("Enter the size");
			int size=sc.nextInt();
			
			for(int i=0;i<size;i++)
			{
				PatientDTO patient=new PatientDTO();
				
				
				System.out.println("Enter the id");
				patient.setId(sc.nextInt());
				System.out.println("Enter the name");
				patient.setName(sc.next());
				System.out.println("Enter the contact number");
				patient.setContactNo(sc.nextLong());
				System.out.println("Enter the address");
				patient.setAddress(sc.next());
				System.out.println("Enter age");
				patient.setAge(sc.nextInt());
				System.out.println("Enter the Gender");
				patient.setGender(Gender.valueOf(sc.next()));
				hp.addPatient(patient);
				
			}
		}catch(Exception e)
		{
			System.out.println("invalid entry");
			e.printStackTrace();
		}
		finally {
			if(sc!=null)
			{
				sc.close();
			}
			
		}
	}
	
	

}
