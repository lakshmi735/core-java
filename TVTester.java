class TVTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		TV tv=new TV();
		String data=tv.name();
		System.out.println("the electronic device is...."+data);
		System.out.println("the main method ended....");
	}
}