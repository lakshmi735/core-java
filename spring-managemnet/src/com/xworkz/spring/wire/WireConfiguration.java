package com.xworkz.spring.wire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WireConfiguration {
	
	@Bean(name="Wire")
	public  Wire getWire() {
		Wire wire = new Wire();
		wire.setId(1);
		wire.setBrand("Havells");
		return wire;
	}
	@Bean(name="Wire1")
	public  Wire getWire1() {
		Wire wire = new Wire();
		wire.setId(2);
		wire.setBrand("philips");
		return wire;
	}
	@Bean(name="Wire2")
	public  Wire getWire2() {
		Wire wire = new Wire();
		wire.setId(3);
		wire.setBrand("Kei");
		return wire;
	}
	@Bean(name="Wire3")
	public  Wire getWire3() {
		Wire wire = new Wire();
		wire.setId(4);
		wire.setBrand("RR Kabel");
		return wire;
	}
	@Bean(name="Wire4")
	public  Wire getWire4() {
		Wire wire = new Wire();
		wire.setId(5);
		wire.setBrand("Syska");
		return wire;
	}

}
