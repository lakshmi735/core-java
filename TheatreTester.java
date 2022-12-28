class TheatreTester
{
	public static void main(String a[])
	{
		System.out.println("the main method started");
		
		String screenType[]={"3D","4DX","MX4D"};
		Theatre movie = new Theatre(1, "Vickory",2,screenType);
		movie.displayDetails();
		
		Theatre movie1 = new Theatre(2, "Prasanna",2,screenType);
		movie1.displayDetails();
	}
}