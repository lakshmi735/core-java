class FastractTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Fastract fastract = new Fastract();
		int data=fastract.time(); 
		System.out.println("the price of the watch is: "+data);
		System.out.println("main method ended....");
	}
}  