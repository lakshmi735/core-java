class Dunzo
{
	public static double foundItem(String item)
	{
		System.out.println("invoked foundItem()");
		if(item == "Vegetables")
		{
			System.out.println("item available");
			return 225.00;
		}
		else
		{
			System.out.println("item not found");
		}
		System.out.println("ended foundItem()");
		return 0.0 ;
	}
	public static double foundItem(String item,int quantity)
	{
		if(item == "Vegetables")
		{
			return 225.00 * quantity;
		}
		else{
			System.out.println("item not found");
		}
		return 0.0;
	}
}