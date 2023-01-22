class TheatreTester
{
	public static void main(String a[])
	{
		System.out.println("main method is started");
		Theatre theatre=new Theatre();
		Screen screen=new Screen(1,"PVR","Malleshwaram",3);
		
		theatre.movie(screen);
		theatre.getScreen();
		System.out.println("main method is ended");
	}
}