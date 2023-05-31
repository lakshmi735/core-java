package com.xworkz.spring.restuarant;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@Component
@ToString
@Getter
@NoArgsConstructor
@Setter

public class Foods {
	
	private int id;
	private String name;
	private String type;
	

}
