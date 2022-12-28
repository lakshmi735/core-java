class ChatAngadi
{
	int id;
	String name;
	String chatNames[];
	
	public ChatAngadi(int id,String name,String chatNames[])
	{
		this.id=id;
		this.name=name;
		this.chatNames=chatNames;
		
	}
	public void displayDetails()
	{
		System.out.println("displaying Details....");
		System.out.println("the id is:" +this.id);
		System.out.println("the name of the shop is:"+this.name);
		System.out.println("the chat names are: ");
		for(int index=0;index<chatNames.length;index++)
		{
			System.out.println(chatNames[index]);
			
		}
	}
	
}