package com.xworkz.hospitalapp.patient;

public class Patient {
	

	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	private int patientId;
	private String patientName;
	private String address;
	private int age;
	private long contactNo;
	
	public Patient(int patientId,String patientName,String address,int age,long contactNo)
	{
		this.patientId=patientId;
		this.patientName=patientName;
		this.address=address;
		this.age=age;
		this.contactNo=contactNo;
	}
	public void setPatientId(int patientId)
	{
		this.patientId=patientId;
	}
	public int getPatientId()
	{

		return patientId;
	}
	public void setPatientName(String patientName)
	{
		this.patientName=patientName;
	}
	public String getPatientName()
	{
		return patientName;
	}
	public void setPatientAddress(String address)
	{
		this.address=address;
	}
	public String getPatientAddress()
	{
		return address;
	}
	public void setPatientAge(int age)
	{
		this.age=age;
	}
	public int getPatientAge()
	{
		return age;
	}
	public void setPatientContactNumber(long contactNo)
	{
		this.contactNo=contactNo;
	}
	public long getPatientContactNumber()
	{
		return contactNo;
	}
	
	

	}


