class PlasticTester
{
	public static void main(String a[])
	{
		System.out.println("main method started.....");
		
		Plastic plastic=new Plastic();
		String data=plastic.isUsedTo();
		System.out.println("chair is used: "+data);
		System.out.println("main method ended....");
	}
}