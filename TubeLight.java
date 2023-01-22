class TubeLight
{
	static boolean isConnected=false;
	public static void main(String lak[])
	{
		giveLight();
		giveLight();
	}
	public static void giveLight()
	{
		System.out.println("giveLight method is started");
		if(isConnected==false)
		{
			isConnected=true;
			System.out.println("Tube Light is turned on:");
			
		}
		else
		{
			System.out.println("Gube..... Tube Light is already turned on");
			
		}
		System.out.println("giveLight method is ended");
	}
}