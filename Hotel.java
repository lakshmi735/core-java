class Hotel
{
	public static void main(String lak[])
	{
		System.out.println("main started");
		serve("Food");
		System.out.println("main ended");
	}
	public static void serve(String customer)
	{
		System.out.println("invoking serve");
		System.out.println(customer);
		System.out.println("serve ended");
	}
}