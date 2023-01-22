class AirCooler
{
	static String brandName="LG";
	static String voltage="230 Volts";
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=10;
	static int currentVolume=3;
	
	public static void onOrOff()
	{
		System.out.println("involing onOrOff method.......:");
		if(isConnected == false)
		{
			isConnected = true;
			System.out.println("the AC is turned on.......:");
		}
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("AC is Turned off");
		}
		System.out.println("onOrOff method ended...............:");
	}
	public static void increaseVolume()
	{
		System.out.println("invoking the increase method");
		if(isConnected == true)
		{
			if(currentVolume<maxVolume)
			{
				currentVolume=currentVolume+1;
				System.out.println("the current volume is :"+currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
		}
		else
		{
				System.out.println("gube .....first turned on the AC");
		
		}
		
		System.out.println("the increase method ended");
	}
	public static void decreaseVolume()
	{
		System.out.println("invoking the decrease method");
		if(isConnected == true)
		{
			if(currentVolume>minVolume)
			{
				currentVolume=currentVolume-1;
				System.out.println("the current volume is :"+currentVolume);
			}
			else
			{
				System.out.println("the minimam volume reached");
			}
		}
		else
		{
			System.out.println("gube .....first turned on the AC");
		}
	}
	public static void main(String lak[])
	{
		System.out.println("the main method started.........:");
		
		onOrOff();
		increaseVolume();
		increaseVolume();
		decreaseVolume();
		decreaseVolume();
		increaseVolume();
		onOrOff();
		increaseVolume();
		increaseVolume();

		System.out.println("the brand name of the AC is:"+brandName);
		System.out.println("the voltage of the AC:"+voltage);
		System.out.println("the minVolume is "+minVolume);
		System.out.println("the maxVolume is "+maxVolume);
		System.out.println("the currentVolume is "+currentVolume);
		System.out.println("the main method ended..........:");
	}
	
}