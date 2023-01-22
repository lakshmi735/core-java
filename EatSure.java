class EatSure
{
    public static double foundItem(String item)
	{
		System.out.println("foundItem method started");
		if(item == "Pizza")
		{
			System.out.println("the Pizza price is 150rs ");
			return 150.00;
		}
		else
		{
			System.out.println("item not found");
		}
		System.out.println("foundItem method ended");
		return 0.0;
	}	
	public static double foundItem(String item,int quantity)
	{
		if(item == "Pizza")
		{
			return 150.00 * quantity;
		}
		else{
			System.out.println("item not found");
		}
		return 0.0;
	}
	
}