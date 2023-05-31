package com.xworkz.serializableapp.hospital;

import java.util.List;

import com.xworkz.serializableapp.dto.PatientDTO;

public interface Hospital {
	public boolean addPatient(PatientDTO dto) throws Exception;
	
	public List<PatientDTO> getAllPatient() throws Exception;

}
