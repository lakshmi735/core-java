class StationeryTester
{
	public static void main(String a[])
	{
		System.out.println("th main method started....");
		
		String noteBook[]={"Science","Kannada","Social","Maths"};
		String pen[]={"Cello", "Uniball", "Pilot"};
		String chart[]={"vegeatables", "Fruits", "Animals"};
		
		Stationery shop=new Stationery(1,"Swapna",noteBook,pen,chart);
		shop.displayDetails();

		Stationery shop2=new Stationery(2,"Roopa",noteBook,pen,chart);
		shop2.displayDetails();
		
	}
}