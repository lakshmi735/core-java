class Theatre
{
	int id;
	String threatreName;
	int noOfScreen;
	String typesOfScreens[];
	
	public Theatre(int id,String threatreName,int noOfScreen,String typesOfScreens[])
	{
		this.id=id;
		this.threatreName=threatreName;
		this.noOfScreen=noOfScreen;
		this.typesOfScreens=typesOfScreens;
	}
	public void displayDetails()
	{
		System.out.println("Displaying Theatre information");
		
		System.out.println("the id of the theatre is : "+this.id);
		System.out.println("the name of the theatre is:"+this.threatreName);
		System.out.println("the no of screen: "+this.noOfScreen);
		System.out.println("the type of the screen: ");
		for(int i=0;i<typesOfScreens.length;i++)
		{
			System.out.println(typesOfScreens[i]);
		}
	}
	
}