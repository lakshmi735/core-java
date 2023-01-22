class DairyMilkTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started....");
		
		DairyMilk milk=new DairyMilk();
		String data=milk.eat();
		System.out.println("the DairyMilk chocolate is  ....."+data);
		System.out.println("the main method ended....");
		
	}
}