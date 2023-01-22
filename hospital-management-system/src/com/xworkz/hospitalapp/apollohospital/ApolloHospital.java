package com.xworkz.hospitalapp.apollohospital;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	boolean isApplicationFilled=true;

	public ApolloHospital(int size) {
		patient=new Patient[size];
		System.out.println("ApolloHopital oject created");
		
	}
	@Override
	public boolean admit(Patient patient)
	{
		System.out.println("Inside admit of ApolloHospital");
		if(isApplicationFilled==true)
		{
			System.out.println("Form Filled Completed can add patient now....hurry");
			boolean isAdmited=super.admit(patient);
			return isAdmited;
		}
		return false;
	}
	public String canteen()
	{
		System.out.println("cateen object");
		return "foodDelious";
	}

}
