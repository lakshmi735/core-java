package com.xworkz.jpa.jpa_example.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="hospital")
@NamedQueries({
@NamedQuery(name="updateNameById",query="update HospitalDTO entity set hospitalName =:name where id=:id"),
@NamedQuery(name="getNameById",query="select hospitalName from HospitalDTO entity where id =:id"),
@NamedQuery(name="getNameAndNumber", query="select hospitalName,phoneNumber from HospitalDTO entity ")
})
public class HospitalDTO {
	@Id
	@Column(name="hospital_id")
	private int id;
	
	@Column(name="hospital_name")
	private String hospitalName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_no")
	private long phoneNumber;
	
	

}
