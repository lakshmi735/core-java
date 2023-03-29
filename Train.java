package com.xworkz.spring.Train;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Train {
	
	private int id;
	private String name;
	private String source;
	private String destination;
	private int ticketPrice;

}
