class Stationery
{
	public int id;
	public String shopName;
	public String[] noteBooks;
	public String[] pens;
	public String[] charts;
	
	public Stationery(int id,String shopName,String[] noteBooks,String[] pens,String[] charts)
	{
		this.id=id;
		this.shopName=shopName;
		this.noteBooks=noteBooks;
		this.pens=pens;
		this.charts=charts;
	}
	public void displayDetails()
	{
		System.out.println("Displaying Stationery details:");
		
		System.out.println("the Stationery  shop id is:"+this.id);
		System.out.println("this name of the shop is:"+this.shopName);
		System.out.println("the note books available in the shop:" );
		
		for(int index=0;index<noteBooks.length;index++)
		{
			System.out.println(noteBooks[index]);
		}
		System.out.println("The pens are available in the shop: ");
		
		for(int index=0;index<pens.length;index++)
		{
			System.out.println(pens[index]);
		}
		System.out.println("The Charts are available in the shop:");
		
		for(int index=0;index<charts.length;index++)
		{
			System.out.println(charts[index]);
		}
	}
}