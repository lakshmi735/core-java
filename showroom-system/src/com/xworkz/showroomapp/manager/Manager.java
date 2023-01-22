package com.xworkz.showroomapp.manager;
//Encapsulated class 
public class Manager {
	public Manager() {
		// TODO Auto-generated constructor stub
	}      //defalut constructor
	
	private int managerId;
	private String managerName;
	private long contactNumber;
	private String qualification;
	private String gender;
	
	public Manager(int managerId,String managerName,long contactNumber,String qualification,String gender)
	{
		this.managerId=managerId;
		this. managerName=managerName;
		this.contactNumber=contactNumber;
		this.qualification=qualification;
		this.gender=gender;
	}
	public void setManagerId(int managerId)
	{
	this.managerId=managerId;	
	}
	public int getManagerId()
	{
		return managerId;
	}
	public void setManagerName(String managerName)
	{
		this.managerName=managerName;
	}
	public String getManagerName()
	{
		return managerName;
	}
	 public void setContactNumber(long contactNumber)
	 {
		 this.contactNumber=contactNumber;
	 }
	 public long getContactNumber()
	 {
		 return contactNumber;
	 }
	 public void setQualification(String qualification)
	 {
		 this.qualification=qualification;
	 }
	 public String getQualification()
	 {
		 return qualification;
	 }
	 public void setGender(String gender)
	 {
		 this.gender=gender;
	 }
	 public String getGender()
	 {
		 return gender;
	 }
}
