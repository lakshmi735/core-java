package com.xworkz.spring.restuarant1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
public class Owner {
	
	
	@Autowired
	@Qualifier("a2b")
	private Restuarant restuarant;
	

}
