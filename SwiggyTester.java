class SwiggyTester
{
	public static void main(String lak[])
	{
		System.out.println("the main ethod started");
		double priceOfItem=Swiggy.foodItem("Doosa",2);
		double itemwithQuantity=Swiggy.foodItem("idli",3);
		
		System.out.println("the price of the food item is :"+priceOfItem);
		System.out.println("the price of the food item is:"+itemwithQuantity);
		System.out.println("the main method ended");
	}
}