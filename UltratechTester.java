class UltratechTester
{
	public static void main(String a[])
	{
		System.out.println("main method started....");
		
		Ultratech ultratech = new Ultratech();
		String data=ultratech.usedFor();
		System.out.println("Cement is for ...."+data);
		System.out.println("main method ended....");
	}
}