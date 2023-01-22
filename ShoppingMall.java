class ShoppingMall
{
	Shop shop[]=new Shop[1];
	int index;
	
	public ShoppingMall()
	{
		System.out.println("the ShoppingMall object is created");
		
	}
	public boolean include(Shop shop)
	{
		System.out.println("the include process started");
		boolean isInclude=false;
		if(shop.shopName!=null)
		{
			this.shop[index++]=shop;
			isInclude=true;
		}
		System.out.println("the include process ended");
		return isInclude;
	}
	public void getShop()
	{
		for(int index=0;index<shop.length;index++)
		{
			System.out.println(shop[index].shopId + " " +shop[index].shopName + " " +shop[index].address+ " " +shop[index].noOfShop);
		}
	}
}