class Zomato
{
public static double findItem(String item)
{
	System.out.println("invoked findItem()");
	if(item == "Biriyani")
	{
		System.out.println("food available");
		return 225.0;
	}
	if(item  == ("Noodles")
	{
		System.out.println("food available");
		return 70.00;
		
	}
	
	if(item == ("Cake")
	{
		return 450.00;
	}
	if(item  == ("Burger")
	{
		System.out.println("food available");
		return 190.00;
		
	}
	if(item  == ("Ice Cream")
	{
		System.out.println("food available");
		return 68.00;
		
	}
	if(item  == ("Pizza")
	{
		System.out.println("food available");
		return 199;	
	}
	else{
		System.out.println("item not found");
	}
	System.out.println("end of findItem()"); 
	return 0.0;
}
}
//10 if
//4 examples