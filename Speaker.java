class Speaker
{
	static String brandname = "Bose";
	static String frequency = "20hrtz";
	static boolean isWireLess=true;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume =10 ;
	static int currentVolume=5;
	
	public static void onOrOff()//we can use use return type as boolean
	{    
		System.out.println("invoking onOrOff method....");
		//update(CRUD)
		if(isConnected == false)  //if(isConnected != false)
		{
			isConnected = true;
			System.out.println("Speaker is turned on.....:");
		}
		else if(isConnected == true)
		{
			isConnected = false;
			System.out.println("Speaker is turned off....");
		}
		System.out.println("onOrOff method ended:");
		
	}//functionality of speaker
	public static void increaseVolume()
	{
		System.out.println("invoking increaseVolume method:");
		if(isConnected==true)
		{
			if(currentVolume<maxVolume)
			{
				currentVolume=currentVolume+1;
				System.out.println("the current volume is:"+currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
		}
		else{
			System.out.println("gube....first turn on the speaker:");
		}
		System.out.println("the increaseVolume method ended:");
	}
public static void decreaseVolume()
{
	System.out.println("invoking decreaseVolume method:");
	if(isConnected == true)
	{
		if(currentVolume>minVolume)
		{
			currentVolume=currentVolume-1;
			System.out.println("the current volume is:"+currentVolume);
		}
		else
		{
			System.out.println("minimum volume reached:");
		}
	}
	else
	{
		System.out.println("gube....first turn on the speaker:");
	}
	System.out.println("the decreaseVolume method ended:");
}	
	public static void main(String lak[])
	{
		System.out.println("main method started...:");
		onOrOff();
		increaseVolume();
		decreaseVolume();
		decreaseVolume();
		decreaseVolume();
		increaseVolume();
		onOrOff();
		//decreaseVolume();
		increaseVolume();
		System.out.println("the brand name of the speaker is: "+brandname);
		System.out.println("the frequency of the speaker is: "+frequency);
		System.out.println("is speaker is wireless...." +isWireLess);
		System.out.println("the minimum volume of the speaker : "+minVolume);
		System.out.println("the maximum volume of the speaker : "+maxVolume);
		
		System.out.println("the current volume of the speaker : "+currentVolume);
		System.out.println("main method is ended.....:");
	}
}