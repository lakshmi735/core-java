class MrfTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Mrf mrf= new Mrf();
		String data=mrf.use();
		System.out.println("the bata is used for...:"+data);
		System.out.println("main method ended....");
	}
}