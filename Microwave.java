class Microwave
{
	static String brandName="Walpoor";
	static String capacity="30 liter";
	static String specialFeature="Auto-cook";
	static boolean isConnected;
	static int minTime ;
	static int maxTime=7;
	static int currentTime=5;
	
	public static void onOrOff()
	{
		System.out.println("the onOrOff method started");
		if(isConnected == false)
		{
			isConnected=true;
			System.out.println("Microwave is turned on.....");
		}
		else if(isConnected == true)
		{
			isConnected=false;
			System.out.println("Microwave is turned off......");
			
		}
		
		System.out.println("the onOrOff method ended");
		
	}
	public static void increaseTime()
	{
		System.out.println("invoking the inctrease Time");
		if(isConnected == true)
		{
			if(currentTime<maxTime)
			{
				currentTime=currentTime+1;
				System.out.println("the current time is"+currentTime);
			}
			else
			{
				System.out.println("the maxTime is reached");
			}
		}
		else{
			System.out.println("gube.....first turned on Microwave");
		}
	}
	public static void decreaseTime()
	{
		System.out.println("invoking decreaseTime method");
		if(isConnected==true
		)
		{
			if(currentTime > minTime)
			{
				currentTime=currentTime-1;
				System.out.println("the curren time is:"+currenTime);
			}
			else{
				System.out.println("the minmum time is reached");
			}
		}
		else
		{
			System.out.println("first turned on Microwave");
		}
	}
	public static void main(String a[])
	{
		System.out.println("the main method started");
		onOrOff();
		increaseTime();
		increaseTime();
		increaseTime();
		decreaseTime();
		onOrOff();
		decreaseTime();
		System.out.println("the brand Name of the Microwave is :"+brandName);
		System.out.println("the capacity of the Microwave :"+capacity);
		System.out.println("the special Feature of the Microwave :"+specialFeature);
		System.out.println("the minimu Time of the Microwave : "+minTime);
		System.out.println("the maximum Time of the Microwave :"+maxTime);
		System.out.println("the current Time of the Microwave :"+currentTime);
		System.out.println("the main method ended");
		
	}
}