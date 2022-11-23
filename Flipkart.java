class Flipkart
{
	public static void itemName(String item)
	{
		System.out.println("invoking itemName()");
		if(item==Fridge)
		{
			System.out.println("the Fridge price is 25000rs: ");
			return;
		}
		else
		{
			System.out.println("the item not available");
		}
		System.out.println("itemName method ended");
		return;
	}
}