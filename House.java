class House
{
	int id;
	String houseName;
	String ownerName;
	String familyMembers[];
	
	public House(int id,String houseName,String ownerName,String familyMembers[])
	{
		this.id=id;
		this.houseName=houseName;
		this.ownerName=ownerName;
		this.familyMembers=familyMembers;
	}
	public void displayDetails()
	{
		System.out.println("Displaying House information");
		
		System.out.println("the id of the theatre is : "+this.id);
		System.out.println("the name of the House is:"+this.houseName);
		System.out.println("the owner name is: "+this.ownerName);
		System.out.println("family Members: ");
		for(int i=0;i<familyMembers.length;i++)
		{
			System.out.println(familyMembers[i]);
		}
	}
	
}