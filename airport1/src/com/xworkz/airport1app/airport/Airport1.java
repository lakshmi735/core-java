package com.xworkz.airport1app.airport;

import com.xworkz.airport1app.terminal.Terminal;

public class Airport1 {
	Terminal terminal[];
	int i;
	
	public Airport1(int size)
	{
		System.out.println("the Object is crerated");
		terminal=new Terminal[size];
	}
	public Airport1() {
		// TODO Auto-generated constructor stub
	}
	public boolean  add(Terminal entry)
	{
		System.out.println("the add process started....");
		boolean isAdded=false;
		if(entry.getTerminalName()!=null && entry.getTerminalName()!="")	
		{
			this.terminal[i]=entry;
			i++;
			isAdded=true;
		}	
		System.out.println(" the add process ended.....");    
		return isAdded;
	}
	public void getTermainal()
	{
		for(int i=0;i<this.terminal.length;i++)
		{
			System.out.println(terminal[i].getTerminalId()+ " " +terminal[i].getTerminalName() + " " +terminal[i].getNoOfGate());
		}
	}
	public Terminal getTerminalByTerminalId(int terminalId)
	{
		System.out.println("getTerminalByTerminalId started....");
		for(int i=0;i<terminal.length;i++)
		{
			if(terminal[i].getTerminalId()==terminalId)
			{
				System.out.println("Patient id is matching..proceed the data");
				System.out.println(terminal[i].getTerminalId()+ " " +terminal[i].getTerminalName() + " " +terminal[i].getNoOfGate());

				return terminal[i];
			}
			System.out.println("end of getTerminalByTerminalId method");
			
		}
		return null;
	}
	public boolean updateNoofGtaelByTerminalId(int newNoOfGate ,int terminalId)
	{
		boolean isNoOfGtaeUpdated=false;
		System.out.println("the updatePatientByPatientName started");
		for(int i=0;i<terminal.length;i++)
		{
			if(terminal[i].getTerminalId()==terminalId)
			{
			System.out.println("Current NoOfGtae is"+ terminal[i].getNoOfGate());
			terminal[i].setNoOfGate(newNoOfGate);
			System.out.println("update NoOfGtae is"+terminal[i].getNoOfGate());
					
			}
		}
		return isNoOfGtaeUpdated;

	}
				

		
	

}
