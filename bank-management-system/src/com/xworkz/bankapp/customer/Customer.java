package com.xworkz.bankapp.customer;

public class Customer {
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	private int customerId;
	private String customerName;
	private int age;
	private long contactNo;
	
	public Customer( int customerId,String customerName,int age,long contactNo)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		this.age=age;
		this.contactNo=contactNo;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public void  setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void  setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void  setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}
	public long getContactNo()
	{
		return contactNo;
	}

}
