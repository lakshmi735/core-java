package com.xworkz.spring.automobile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Automobile {
	
	@Autowired
	private List<SpareParts> parts;

}
