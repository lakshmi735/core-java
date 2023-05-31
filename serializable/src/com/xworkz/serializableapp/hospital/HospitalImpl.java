package com.xworkz.serializableapp.hospital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.serializableapp.comparator.ageComparator;
import com.xworkz.serializableapp.dto.PatientDTO;

public class HospitalImpl implements Hospital {

	@Override
	public boolean addPatient(PatientDTO dto) throws Exception {
		System.out.println("addPatient method started");
		boolean isAdded=false;
		if(dto!=null && dto.getId() >=1 && dto.getName()!=null) {
			patient.add(dto);
			System.out.println("Sales Person data added sucessfully");
			isAdded=true;
		}
		else {
			System.out.println("data not entered");
		}
		return isAdded;
	}

	@Override
	public List<PatientDTO> getAllPatient() throws Exception {
		System.out.println("getAllPatient started");
		List<PatientDTO> dt = new ArrayList<PatientDTO>();
		Collections.sort(patient, new ageComparator());
		Iterator<PatientDTO> itr =patient.iterator();
		while(itr.hasNext())
		{
			dt.add(itr.next());
		}
		System.out.println(dt);
		System.out.println("get all patient method ended");
		
		
		return dt;
	}
	
	
	List<PatientDTO> patient;
	public HospitalImpl() {
		patient=new ArrayList<PatientDTO>();
	}

	


}
