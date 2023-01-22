package com.xworkz.shoppingmallapp.shops;

public class Shops {
	public Shops() {
		// TODO Auto-generated constructor stub
	}
	private int shopId;
	private String shopName;
	private String address;
	private long contactNo;
	
	public Shops(int shopId,String shopName,String address,long contactNo)
	{
		this.shopId=shopId;
		this.shopName=shopName;
		this.address=address;
		this.contactNo=contactNo;
	}
	public void setShopId(int shopId)
	{
		this.shopId=shopId;
	}
	public int getShopId()
	{
		return shopId;
	}
	public void setShopName(String shopName)
	{
		this.shopName=shopName;
	}
	public String getShopName()
	{
		return shopName;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setContactNo(long contactNo)
	{
		this.contactNo=contactNo;
	}
	public long getContactNo()
	{
		return contactNo;
	}

}
