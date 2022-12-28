class HouseTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		String members[]={"father","Mother", "Son", "Daughter"};
		House family = new House(1, "VickSwathi Nilaya","Rangappa",members);
		family.displayDetails();
		
		House family1 = new House(2, "Prasanna Nilaya","Gowri",members);
		family1.displayDetails();
	}
}