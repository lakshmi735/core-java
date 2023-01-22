class WhirpoolTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started....");
		
		Whirpool whirpool=new Whirpool();
		int data=whirpool.cost();
		System.out.println("the cost of the Fridge is...."+data);
		System.out.println("the main method ended....");
		
	}
}