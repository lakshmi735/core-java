class EatSure
{
    public static void foundItem(String item)
	{
		System.out.println("foundItem method started");
		if(item == "Pizza")
		{
			System.out.println("the Pizza price is 150rs ");
			return ;
		}
		else
		{
			System.out.println("item not found");
		}
		System.out.println("foundItem method ended");
		return;
	}	
	
}