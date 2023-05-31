package com.xworkz.spring.restuarant1;

public interface Restuarant {
	
	default String serveFood() {
		return "Restuarant serve food";
	}

}
