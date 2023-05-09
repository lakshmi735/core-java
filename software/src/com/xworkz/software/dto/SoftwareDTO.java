package com.xworkz.software.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoftwareDTO {

	private int id;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=35)
	private String software_name;
	
	private String company_name;
	
	private String place;
	
	private String language;

}
