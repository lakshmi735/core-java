class RailyStationTester
{
	public static void main(String a[])
	{
		System.out.println("the main method is started");
		
		RailyStation raily=new RailyStation();
		Platform platform=new Platform(1,"xyz",4);
		
		raily.include(platform);
		raily.getPlatform();
		
		System.out.println("the main method is ended");
		
	}
}