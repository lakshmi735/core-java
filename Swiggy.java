class Swiggy
{
	public static double foodItem(String item)
	{
		System.out.println("invoked foodItem()");
		if(item == "Doosa")
		{
			System.out.println("food is available");
			return 40.00;
			
		}
		if(item == "idli")
		{
			System.out.println("food item is available");
			return 30.00;
		}
		else
		{
			System.out.println("food item not found");
		}
	
	System.out.println("foodItem method ended");
	return  0.0;
	//if use void as return type return is none .....void means nothing
	}
	public static double foodItem(String item ,int quantity)
	{
		System.out.println("invoking foodItem()");
		if(item == "Doosa")
		{
			System.out.println("food item is available");
			return 40.00 * quantity;
		}
		if(item == "idli")
		{
			System.out.println("food item is available");
			return 30.00 * quantity;
		}
		else{
			System.out.println("food item is not found");
		}
		System.out.println("end of foodItem()");
		return 0.0;
	}
}