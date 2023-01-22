package com.xworkz.encapsulationapp.manager;

public class Manager {
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	private int managerId;
	private String managerName;
	private String address;
	private String qualification;
	private String gender;
	
	public Manager(int managerId,String managerName,String address,String qualification,String gender)
	{
		this.managerId=managerId;
		this.managerName=managerName;
		this.address=address;
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
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
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
