package com.xworkz.encapsulationapp.platform;

public class Platform {
	public Platform() {
		// TODO Auto-generated constructor stub
	}
	private int platformId;
	private String platformName;
	private int platformNo;
	
	public Platform(int platformId,String platformName,int platformNo)
	{
		this.platformId=platformId;
		this.platformName=platformName;
		this.platformNo=platformNo;
	}
	public void setPlatformId(int platformId)
	{
		this.platformId=platformId;
	}
	public int getPlatformId()
	{
		return platformId;
	}
	public void setPlatformName(String platformName)
	{
		this.platformName=platformName;
	}
	public String getPlatformName()
	{
		return platformName;
	}
	public void setPlatformNumber(int platformNo)
	{
		this.platformNo=platformNo;
	}
	public int getPlatformNumber()
	{
		return platformNo;
	}

}
