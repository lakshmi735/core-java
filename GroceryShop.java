class GroceryShop
{
	public int id;
	public String shopName;
	public String[] location;
	public String ownerName;
	public String[] item;
	
	
	public GroceryShop(int id,String shopName,String[] location,String  ownerName,String[] item)
	{
		this.id=id;
		this.shopName=shopName;
		this.location=location;
		this.ownerName=ownerName;
		this.item=item;
	}
	public void displayDetails()
	{
		System.out.println("Displaying Grocery shop Information:");
		System.out.println("the shop id is:"+this.id);
		System.out.println("the shop name is:"+this.shopName);
		System.out.println("the name of the shop owner:"+this.ownerName);
		System.out.println("the shop location are:");
		for(int index=0;index<location.length;index++)
		{
			System.out.println(location[index]);
		}
		//System.out.println("the name of the shop owner:"+this.ownerName);
		System.out.println("the item are available in the shop:");
		for(int index=0;index<item.length;index++)
		{
			System.out.println(item[index]);
		}
		
	}
	
}