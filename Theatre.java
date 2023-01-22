class Theatre
{
	Screen screen[]= new Screen[1];
	int index;
	
	public Theatre()
	{
		System.out.println("object is created");
	}
	public boolean movie(Theatre theatre)
	{
		System.out.println("the movie process started");
		boolean isMovie=false;
		if(theatre.theatreName!=null)
		{
			this.screen[index++]=theatre;
			isMovie=true;
		}	
		System.out.println("movies orocess ended...");
		return isMovie;
	}
	public void getScreen()
	{
		for(int index=0;index<this.screen.length;index++)
		{
			System.out.println(screen[index].theatreId+ " " +screen[index].theatreName + " " +screen[index].address + " " +screen[index].screenNo);
		}
	}
}