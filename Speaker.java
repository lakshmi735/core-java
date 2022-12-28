class Speaker
{  //static variable
static String brand="Realme";
static double price=1200.00;
static String speakerType="Bluetooth Speaker";
static String connectionType="USB";
static boolean isConnected;    //static boolean isConnected=false;
static int maxVolume=6;
static int currentVolume;
static int minVolume;
    

//local variable
public static void onOrOff()
{
	System.out.println("invoking onOrOff()");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("speaker is turned on....");
		
	}
	else if(isConnected==true){
		isConnected = false;
		System.out.println("speaker is turned off...");
		System.out.println("end of onOrOff()");
		
	}
	
}
public static void main(String a[])
{
	System.out.println(brand);
	System.out.println(price);
	System.out.println(speakerType);
	System.out.println(connectionType);
	onOrOff();                                              
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	decreaseVolume();
	onOrOff();

	
}
public static void increaseVolume()
{
	System.out.println("increaseVolume method started");
	if(isConnected == true)           //if(isConnected==false) else msz will displaay
	{
		System.out.println("Speaker is turned on");
		if(currentVolume<maxVolume)
		{
			currentVolume=currentVolume+1;
			System.out.println("currentVolume is: "+currentVolume);
		
		}
	
	else{
		System.out.println("maxVolume reached:");
	}
}
else{
	System.out.println("gube...Speaker on madu");
}
System.out.println("increaseVolume method ended");
	
}
public static void decreaseVolume()
{
	System.out.println("invoking decreaseVolume");
	if(isConnected == true)
	{
		System.out.println("speaker is turned on");
		if(currentVolume>minVolume)+
		{
			currentVolume=currentVolume-1;
			System.out.println("currentVolume is: "+currentVolume);
		
		}
		else{
			System.out.println("minVolume reached:" );
		}
	}
	else{
		System.out.println("speaker on madu");
	}
	System.out.println("decreaseVolume method ended");
	
}
}




