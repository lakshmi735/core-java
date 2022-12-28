class GroceryShopTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started...");
		
		String location[]={"Rt nagar", "Rajaji nagar", "Basweshwara nagar", "RR nagar"};
		String item[]={"Sugar" , "Oil" , "Coffee Powder", "Salt"};
		
		GroceryShop grocery=new GroceryShop(1,"vinayaka",location,"Surya",item);
		grocery.displayDetails();
		
		GroceryShop grocery1=new GroceryShop(2, "Shree Venkateswra",location, "Anvitha",item);
		grocery1.displayDetails();
		
	
	}
}