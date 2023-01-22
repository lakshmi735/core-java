package com.xworkz.bankapp;

import java.util.Scanner;

import com.xworkz.bankapp.bank.Bank;
import com.xworkz.bankapp.bank.HdfcBank;
import com.xworkz.bankapp.customer.Customer;

public class BankTester {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size");
		int size=sc.nextInt();
		Bank bank=new HdfcBank(size);
		
		for(int i=0;i<size;i++)
		{    
			Customer customer=new Customer();
			
			System.out.println("Enter the Customer Id");
			customer.setCustomerId(sc.nextInt());
			System.out.println("Enter the Customer Name");
			customer.setCustomerName(sc.next());
			System.out.println("Enter the customer age");
			customer.setAge(sc.nextInt());
			System.out.println("Enter the customer contact number");
			customer.setContactNo(sc.nextLong());
			
			bank.saveAllCustomer(customer);
			//System.out.println(customer.getCustomerId() + " " +customer.getCustomerName()+ " " +customer.getAge() + " " +customer.getContactNo());


		}
		
		System.out.println("Enetr 1 to fetch all customer");
		System.out.println("Enetr 2 fetch customer by id");
		
		int option=sc.nextInt();
		switch(option)
		{
		case 1: bank.getAllCustomer();
		break;
		case 2:
			System.out.println("Enter id to be fetched");
			int customerId=sc.nextInt();
			bank.getCustomerbyCustomerId(customerId);
			break;
		}
	
		
		System.out.println("main method ended");
		sc.close();
	}

}
