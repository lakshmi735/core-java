package com.xworkz.collectionapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CustomerTester implements Comparable<CustomerTester> { 
  public CustomerTester() {
  }
	private int id;
		 private String name;
		 private String addrss;
		 String email;
		@Override
		public int compareTo(CustomerTester o) {
			// TODO Auto-generated method stub
			return  this.id-o.id;
		}
		 
		
		
	}
	


