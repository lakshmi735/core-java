package com.xworkz.theatreapp.screen;

public class Screen {
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	private int theatreId;
	private String theatreName;
	private String address;
	private int screenNo;
	
	public Screen(int theatreId,String theatreName,String address,int screenNo)
	{
		this.theatreId=theatreId;
		this.theatreName=theatreName;
		this.address=address;
		this.screenNo=screenNo;
	}
	public void setTheatreId(int theatreId)
	{
		this.theatreId=theatreId;
	}

	public int getTheatreId()
	{
		return theatreId;
	}
	
	public void setTheatreName(String theatreName)
	
	{
		this.theatreName=theatreName;
	}
	
	public String getTheatreName()
	{
		return theatreName;
	}
	
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setScreenNo(int screenNo)
	{
		this.screenNo=screenNo;
	}
	public int getScreenNo()
	{
		return screenNo;
	}
	


}
