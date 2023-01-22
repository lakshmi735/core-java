class PizzaHut
{
	public static double findItem(String item)
	{
		System.out.println("invoking findItem()");
		if(item=="pizza")
		{
			System.out.println(" the item is available ");
			return 200.00;
		}
		else
		{
			System.out.println("the item not available");
		}
		System.out.println("findItem method ended");
		return 0.0;
	}
	public static double findItem(String item,int quantity)
	{
		if(item=="pizza")
		{
			return 200.00 * quantity;
		}
		else 
		{
			System.out.println("item not found");
		}
		return 0.0;
	}
}