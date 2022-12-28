class Restuarant
{
	public int id;
	public String location;
	public String name;
	public String[] workers;
	public String[] menu;
	
	public Restuarant(int id,String name,String location,String[] workers,String[] menu)
	{
		this.id=id;
		this.location=location;
		this.name=name;
		this.workers=workers;
		this.menu=menu;
		
	}
	
	public void displayDetails()
	{
		System.out.println("Displaying Restuarant information:");
		
		System.out.println("the Restuarant id is :"+this.id);
		System.out.println("The Restuarant name is:"+this.name);
		System.out.println("The Restuarant location is:"+this.location);
		System.out.println("the Restuarant workers are: ");
		for(int index=0;index<workers.length;index++)
		{
			System.out.println(workers[index]);
		}
		System.out.println("the Restuarant menu are: ");
		
		for(int index=0;index<menu.length;index++)
		{
			System.out.println(menu[index]);
		}
}
}