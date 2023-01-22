class Hospital
{
	
	public static void main(String lak[])
	{
	System.out.println("main started");
		checkup("Recovery");
	System.out.println("main ended");
	}
	public static void checkup(String patient)
	{
		System.out.println("invoking checkup");
		System.out.println(patient);
		System.out.println("checkup ended");
	}
}