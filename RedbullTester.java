class RedbullTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Redbull redbull = new Redbull();
		String data=redbull.drinkFor();
		System.out.println("Redbull is a ...."+data);
		System.out.println("main method ended....");
	}
}