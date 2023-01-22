package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital extends Object {

	  
		public Patient patient[];  //here Patient is non primitive datatype
		int index;
		
		public Hospital(int size)
		{
			System.out.println("Hostial object is created...");
			patient=new Patient[size];
			
		}
		
		public Hospital() {
			// TODO Auto-generated constructor stub
		}
		
		                    //at a time one patient
		public boolean admit(Patient pat)     ///admit is a relationship of hospital .....boolean
		{
			System.out.println("Admit process started...");
			boolean isAdmitted=false;
			//validation
			if(pat.getPatientName()!=null)
			{
				this.patient[index++]=pat;    
				isAdmitted=true;
				
			}
			System.out.println("Admit process ended....");
			return isAdmitted;
		}
		public void getAllPatients()
		{
			//System.out.println()
			for(int ind=0;ind<this.patient.length;ind++)
			{
				System.out.println(patient[ind].getPatientId() + " "+patient[ind].getPatientName() + " " +patient[ind].getPatientAddress()+ " " +patient[ind].getPatientAddress() + " " +patient[ind].getPatientContactNumber());
			}
		}
		public  Patient getPatientByPatientId(int patientId)
		{
			System.out.println("Inside getPatientByPatientId method");
			for(int ind=0;ind<patient.length;ind++)
			{
				if(patient[ind].getPatientId()== patientId)
				{
					System.out.println("Patient id is matching..proceed the data");
					System.out.println(patient[ind].getPatientId() + " "+patient[ind].getPatientName() + " " +patient[ind].getPatientAddress()+ " " +patient[ind].getPatientAddress() + " " +patient[ind].getPatientContactNumber());
					return patient[ind];
				}
				System.out.println("end of getPatientByPatientId method");
				
			}
			return null;
		}
		public  Patient getPatientByPatientName(String patientName)
		{
			System.out.println("Inside getPatientByPatientName method");
			for(int ind=0;ind<patient.length;ind++)
			{
				if(patient[ind].getPatientName().equals(patientName))
				{
					System.out.println("Patient name is matching....proceed the data");
					System.out.println(patient[ind].getPatientId() + " "+patient[ind].getPatientName() + " " +patient[ind].getPatientAddress()+ " " +patient[ind].getPatientAddress() + " " +patient[ind].getPatientContactNumber());
					return patient[ind];
				}
				System.out.println("end of getPatientByPatientName method");
				
			}
			return null;
		}
		public  Patient getPatientByAddress(String address)
		{
			System.out.println("Inside getPatientByAddress method");
			for(int ind=0;ind<patient.length;ind++)
			{
				if(patient[ind].getPatientAddress().equals(address))
				{                                  //equal is used to comparing strings
					System.out.println("Patient address is matching....proceed the data");
					System.out.println(patient[ind].getPatientId() + " "+patient[ind].getPatientName() + " " +patient[ind].getPatientAddress()+ " " +patient[ind].getPatientAddress() + " " +patient[ind].getPatientContactNumber());
					return patient[ind];
				}
				System.out.println("end of getPatientByAddress method");
				
			}
			return null;
		}
		public  Patient getPatientByAge(int age)
		{
			System.out.println("Insidez getPatientByAge method");
			for(int ind=0;ind<patient.length;ind++)
			{
				if(patient[ind].getPatientAge() == age)
				{
					System.out.println("Patient age is matching....proceed the data");
					System.out.println(patient[ind].getPatientId() + " "+patient[ind].getPatientName() + " " +patient[ind].getPatientAddress()+ " " +patient[ind].getPatientAddress() + " " +patient[ind].getPatientContactNumber());
					return patient[ind];
				}
				System.out.println("end of getPatientByAge method");
				
			}
			return null;
		}
	
		public boolean updatePatientAgeByPatientId(int newAge ,int patientId)
		{
			boolean isAgeUpdated=false;
			System.out.println("the updatePatientByPatientName started");
			for(int i=0;i<patient.length;i++)
			{
				if(patient[i].getPatientId()==patientId)
				{
				System.out.println("Current age is"+ patient[i].getPatientAge());
				patient[i].setPatientAge(newAge);
				System.out.println("update age is"+patient[i].getPatientAge());
						
				}
			}
			return isAgeUpdated;

		}
		public boolean updatePatientNameByContactno(String newName,long contactNo)
		{
			boolean isNameUpdated=false;
			System.out.println("the updatePatientNameByContactno started");
			for(int j=0;j<patient.length;j++)
			{
				if(patient[j].getPatientContactNumber()==contactNo) {
					System.out.println("Current name is"+ patient[j].getPatientName());
					patient[j].setPatientName(newName);
					System.out.println("update name is"+patient[j].getPatientName());
				}
			}
				return isNameUpdated;	
		}
		
		public boolean updatePatientAgeByPatientName(int newAge ,String patientName)
		{
			boolean isAgeUpdated=false;
			System.out.println("the updatePatientByPatientName started");
			for(int i=0;i<patient.length;i++)
			{
				if(patient[i].getPatientName().equals(patientName))
				{
				System.out.println("Current age is"+ patient[i].getPatientAge());
				patient[i].setPatientAge(newAge);
				System.out.println("update age is"+patient[i].getPatientAge());
						
				}
			}
			return isAgeUpdated;

		}
		
	}




