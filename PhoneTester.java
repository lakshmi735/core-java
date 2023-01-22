class PhoneTester
{
	public static void main( String a[])
	{
		System.out.println("main method started");
		
		Phone phone = new Phone();
		String data=phone.mobile();
		System.out.println("mobile is for..."+data);
		System.out.println("main method ended");
	}
}