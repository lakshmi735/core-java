package com.xworkz.waterfall.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WaterFallDTO {
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=16)
	private int id;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=16)
	private String name;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=16)
	private String place;
	@NotEmpty
	@NotBlank
	@NotNull
	@Size(min=2,max=16)
	private String height;


}
