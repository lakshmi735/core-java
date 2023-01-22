class WildCraftTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		WildCraft craft=new WildCraft();
		int data=craft.price();
		System.out.println("the WildCraft bag price is: "+data);
		System.out.println("the main method ended....");
	}
}
