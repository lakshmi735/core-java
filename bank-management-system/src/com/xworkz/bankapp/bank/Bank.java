package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.customer.Customer;

public class Bank {
	Customer customer[];
	int index;
	
	public Bank(int size)
	{
		customer=new Customer[size];
	}
	public boolean saveAllCustomer(Customer customer)
	{
		boolean isSaveAllCustomer=false;
		if(customer.getCustomerName()!=null)
		{
			this.customer[index++]=customer;
			isSaveAllCustomer=true;
		}
		return isSaveAllCustomer;
	}
	public void getAllCustomer()
	{
		for(int i=0;i<customer.length;i++)
		{
			System.out.println(customer[i].getCustomerId()+ " " +customer[i].getCustomerName()+" "+customer[i].getAge()+ " "+customer[i].getContactNo());
		}
	}
	public Customer getCustomerbyCustomerId(int customerId)
	{
		System.out.println("getCustomerbyCustomerId started");
		for(int i=0;i<customer.length;i++)
		{
			if(customer[i].getCustomerId()==customerId)
			{
				System.out.println(" id is matched proced the data");
				System.out.println(customer[i].getCustomerId()+ " " +customer[i].getCustomerName()+ " "+customer[i].getAge()+ " "+customer[i].getContactNo());
				
			}
			System.out.println("getCustomerbyCustomerId ended");
		}
		return null;
	}
	public  Customer getCustomerByCustomerName(String customerName)
	{
		System.out.println("getCustomerByCustomerName started");
		for(int i=0;i<customer.length;i++)//execute set of code repeatedly
		{
			if(customer[i].getCustomerName()==customerName)
			{
				System.out.println("The Customer name is matching");
				System.out.println(customer[i].getCustomerId() + " " +customer[i].getCustomerName()+ " "+customer[i].getAge()+ " "+customer[i].getContactNo());
 
			}
			System.out.println(" getCustomerByCustomerName ended");
		}
		return null;
	}
	public Customer getCustomerByContactNo(long contactNo)
	{
		System.out.println("getCustomerByContactNo started....");
		for(int i=0;i<customer.length;i++)
		{
			if(customer[i].getContactNo()==contactNo)
			{
				System.out.println("The Customer Contact Number is matching");
				System.out.println(customer[i].getCustomerId() + " " +customer[i].getCustomerName()+ " "+customer[i].getAge()+ " "+customer[i].getContactNo());
						
						
			}
		}
		return null;
		
	}
	public boolean updateContactById(long newContactNo,int customerId)
	{
		boolean idIsUpdated=false;
		for(int i=0;i<customer.length;i++)
		{
			if(customer[i].getCustomerId()==customerId)
			{
				System.out.println("Current contact number is "+customer[i].getContactNo());
				customer[i].setContactNo(newContactNo);
				System.out.println("Current contact number is "+customer[i].getContactNo());
			}
		}
		return idIsUpdated;
	}
	public boolean updateAgeByCustomerName(int newAge,String customerName)
	{
		boolean isAgeUpdated=false;
		for(int i=0;i<customer.length;i++)
		{
			if(customer[i].getCustomerName()==customerName)
			{
				System.out.println("Current age of the Customer"+customer[i].getAge());
				customer[i].setAge(newAge);
				System.out.println(" ");
			}
		}
		return isAgeUpdated;
	}

}
