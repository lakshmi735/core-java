class RailyStation
{
	Platform platform[]=new Platform[1];
	int i;
	
	public RailyStation()
	{
		System.out.println("object is created");
	}
	
	
	public boolean include(Platform entry)
	{
		System.out.println("the include process started");
		boolean isInclude=false;
		if(entry.platformName!=null)
		{
			this.platform[i]=entry;
			i++;
			isInclude=true;
			
		}
		System.out.println("the include process is ended");
		return isInclude;
	}
	public void getPlatform()
	{
		for(int i=0;i<this.platform.length;i++)
		{
			System.out.println(platform[i].platformId + " " +platform[i].platformName+ " " +platform[i].platformNo);
		}
	}
}