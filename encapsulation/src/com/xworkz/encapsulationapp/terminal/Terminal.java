package com.xworkz.encapsulationapp.terminal;

public class Terminal {
	public Terminal() {
		// TODO Auto-generated constructor stub
	}
	private int terminalId;
	private String terminalName;
	private int noOfGate;
	
	public Terminal(int terminalId,String terminalName,int noOfGate)
	{
		this.terminalId=terminalId;
		this.terminalName=terminalName;
		this.noOfGate=noOfGate;
	}
	public void setTEminalId(int terminalId)
	{
		this.terminalId=terminalId;
	}
	public int getTerminalId()
	{
		return terminalId;
		
	}
	public void setTerminalName(String terminalName)
	{
		this.terminalName=terminalName;
	}
	public String getTerminalName()
	{
		return terminalName;
	}
	public void setNoOfGate(int noOfGate)
	{
		this.noOfGate=noOfGate;
	}
	public int getNoOfGate()
	{
		return noOfGate;
	}

}



