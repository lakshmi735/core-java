class RestuarantTester
{
	public static void main(String a[])
	{
		String workers[]={"Raju","Hemanth","Kishaore","Ravi"};
		String menu[]={"Gobi","PaniPuri","Veg Biriyani","Samosa"};
		
		Restuarant rest=new Restuarant(1, "sagar", "Rajajinagar",workers,menu);
		rest.displayDetails();
		
		Restuarant rest1=new Restuarant(2, "Udupi", "Mg Road",workers,menu);
		rest1.displayDetails();
		}
}