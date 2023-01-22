class FinolexTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Finolex finolex = new Finolex();
		String data=finolex.brandName();
		System.out.println("the brand name of the wire is...."+data);
		System.out.println("main method ended....");
	}
}