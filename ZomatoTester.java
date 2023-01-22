class ZomatoTester
{
	public static void main(String lak[])
	{
		//ClassName.variablename(value);
		//Zomato.noOfBranches(4);
		String item="Biriyani";//External referenceing
							 //className.methodName(argument)
		double priceOfItem = Zomato.findItem("item");
		double priceOfItem1 = Zomato.findItem("Noodles");//internal referenceing
		double priceOfItem2 = Zomato.findItem("Cake");
		double priceOfItem3 = Zomato.findItem("Burger");
		double priceOfItem4 = Zomato.findItem("Ice Cream");
		
		System.out.println("the price of the item "+priceOfItem);
		System.out.println("the price of the item "+priceOfItem1);
		System.out.println("the price of the item "+priceOfItem2);
		System.out.println("the price of the item "+priceOfItem3);
		System.out.println("the price of the item "+priceOfItem4);
	}
}
