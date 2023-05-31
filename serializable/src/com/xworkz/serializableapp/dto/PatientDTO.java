package com.xworkz.serializableapp.dto;

import java.io.Serializable;

import com.xworkz.serializableapp.gender.Gender;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class PatientDTO implements Serializable,Comparable<PatientDTO>{
	
	private Integer id;
	private String name;
	private String address;
	private Gender gender;
	private Long contactNo;
	private Integer age;
	@Override
	public int compareTo(PatientDTO o) {
		
		return this.getId()-o.getId();
	}
		
}
