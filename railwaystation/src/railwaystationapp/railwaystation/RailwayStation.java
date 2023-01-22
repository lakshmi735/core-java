package railwaystationapp.railwaystation;



import railwaystationapp.platform.Platform;

public class RailwayStation {
	Platform platform[];
	int i;
	
	public RailwayStation(int size)
	{
		System.out.println("object is created");
		platform=new Platform[size];
	}
	
	
	public boolean include(Platform entry)
	{
		System.out.println("the include process started");
		boolean isInclude=false;
		if(entry.getPlatformName()!=null)
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
			System.out.println(platform[i].getPlatformId() + " " +platform[i].getPlatformName()+ " " +platform[i].getPlatformNo());
		}
	}
	public  Platform getPlatfromByPaltformId(int platformId)
	{
		System.out.println("Inside getPlatfromByPaltformId method");
		for(int ind=0;ind<platform.length;ind++)
		{
			if(platform[ind].getPlatformId()==platformId)
			{
				System.out.println("Plafrom id is matching..proceed the data");
				System.out.println(platform[i].getPlatformId() + " " +platform[i].getPlatformName()+ " " +platform[i].getPlatformNo());				
			}
			System.out.println("end of getPlatfromByPaltformId method");
			
		}
		return null;
	}
	public  Platform getPlatfromByPlatformName(String platformName)
	{
		System.out.println("Inside getPlatfromByPlatformName method");
		for(int ind=0;ind<platform.length;ind++)
		{
			if(platform[ind].getPlatformName().equals(platformName))
			{
				System.out.println("Patient name is matching....proceed the data");
				System.out.println(platform[i].getPlatformId() + " " +platform[i].getPlatformName()+ " " +platform[i].getPlatformNo());	
				return platform[ind];
			}
			System.out.println("end of getPlatfromByPlatformName method");
			
		}
		return null;
	}

}
