class Flipkart
{
	public static double itemName(String item)
	{
		System.out.println("invoking itemName()");
		if(item=="Fridge")
		{
			System.out.println("the Fridge price is 25000rs: ");
			return 25000.00;
		}
		else
		{
			System.out.println("the item not available");
		}
		System.out.println("itemName method ended");
		return 0.0;
	}
	public static double itemName(String item,int quantity)
	{
		if(item=="Fridge")
		{
			return 25000.00 * quantity;
		}
		else 
		{
			System.out.println("the item not found");
		}
		return 0.0;
	}
}