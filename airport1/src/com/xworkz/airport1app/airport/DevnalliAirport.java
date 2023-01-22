package com.xworkz.airport1app.airport;

import com.xworkz.airport1app.terminal.Terminal;

public class DevnalliAirport extends Airport1 {

	boolean isAddTerminal=true;
	
	
	public DevnalliAirport(int size)
	{
		terminal=new Terminal[size];
		System.out.println("DevnalliAirport object is created");
	}
	@Override
	public boolean add(Terminal terminal)
	{
		System.out.println("Insert the terminal");
		if(isAddTerminal==true)
		{
			System.out.println("Terminal is added");
			super.add(terminal);
		}
		return false;
	}
	

}
