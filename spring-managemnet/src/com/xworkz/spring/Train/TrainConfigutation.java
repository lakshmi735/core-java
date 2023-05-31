package com.xworkz.spring.Train;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainConfigutation {
	@Bean(name="Train")
	public Train getTrain() {
		Train train=new Train();
		train.setId(1);
		train.setName("karavali Express");
		train.setSource("yeshwanthpura");
		train.setDestination("Udupi");
		train.setTicketPrice(150);
		return train;
	}
	@Bean(name="Train1")
	public Train getTrain1() {
		Train train=new Train();
		train.setId(2);
		train.setName("Maharaj Express");
		train.setSource("Mejestic");
		train.setDestination("Dehli");
		train.setTicketPrice(1750);
		return train;
		}
	@Bean(name="Train3")
	public Train getTrain3() {
		Train train=new Train();
		train.setId(3);
		train.setName("Tejas Express");
		train.setSource("yeshwanthpura");
		train.setDestination("Chennai");
		train.setTicketPrice(450);
		return train;
	}
	@Bean(name="Train4")
	public Train getTrain4() {
		Train train=new Train();
		train.setId(4);
		train.setName("Vande Bharat Express");
		train.setSource("Dehli");
		train.setDestination("Maharastra");
		train.setTicketPrice(850);
		return train;
	}
	@Bean(name="Train2")
	public Train getTrain2() {
		Train train=new Train();
		train.setId(5);
		train.setName("Maitree Express");
		train.setSource("yeshwanthpura");
		train.setDestination("Hydrabadh");
		train.setTicketPrice(550);
		return train;
	}
	}
	


