class SantoorTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Santoor santoor = new Santoor();
		String data=santoor.brand();
		System.out.println("the soap brand name is...."+data);
		System.out.println("main method ended....");
	}
}