package hospitalappabs.hospital;

import hospitalappabs.exception.EmailNotFoundException;
import hospitalappabs.patient.Patient;

public interface Hospital {
	public boolean admit(Patient pat);
	public void getAllPatients();
	public  Patient getPatientByPatientId(int patientId);
	public  Patient getPatientByPatientName(String patientName);
	public  Patient getPatientByAddress(String address);
	public  Patient getPatientByAge(int age);
	public boolean updatePatientAgeByPatientId(int newAge ,int patientId);
	public boolean updatePatientNameByContactno(String newName,long contactNo);
	public boolean updatePatientAgeByPatientName(int newAge ,String patientName);
	public Patient getPatientByEmail(String email) throws EmailNotFoundException;
	

}
