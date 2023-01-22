class UberEats
{
	static public double foodItem(String item)
	{
		System.out.println("foodItem method started....");
		if(item == "Rotti")
		{
			//System.out.println("the price of the Idli is 30rs: ");
			return 20.00 ; 
		}
		else
		{
			System.out.println("food item not found");
		}
		System.out.println("foodItem ended");
		return 0.0 ;
	}
	public static double foodItem( String item,int quantity)
	{
		System.out.println("foodItem method started....");
		if(item == "Rotti")
		{
			return 20.00 * quantity;
		}
		else{
			System.out.println("item not found");
		}
		System.out.println("foodItem method ended....");
		return 0.0;
	}
}
