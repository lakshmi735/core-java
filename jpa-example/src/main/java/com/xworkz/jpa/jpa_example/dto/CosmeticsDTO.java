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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cosmetics_table")
@NamedQueries({
@NamedQuery(name="updateNameAndPriceById", query="update CosmeticsDTO entity set cosmeticName=:name,price=:price where id =:id"),
@NamedQuery(name="getNameAndPriceById" ,query="select cosmeticName,price from CosmeticsDTO entity where id =:id"),
@NamedQuery(name="getNameAndType",query="select cosmeticType,price from CosmeticsDTO entity")
})
public class CosmeticsDTO {
	
	@Id
	@Column(name="cosmetics_id")
	private int id;
	
	@Column(name="cosmetics_name")
	private String cosmeticName;
	
	@Column(name="cosmetics_type")
	private String cosmeticType;
	
	@Column(name="price")
	private double price;
	
	@Column(name="mgf_date")
	private String mfg_date;
	
	@Column(name="exp_date")
	private String exp_date;

}
