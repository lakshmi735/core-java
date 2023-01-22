package com.xworkz.theatreapp.theatre;


import com.xworkz.theatreapp.screen.Screen;

public class Theatre {
	Screen screen[];
	int index;
	
	
	public Theatre(int size)
	{
		System.out.println("object is created");
		screen=new Screen[size];
	}
	public boolean movie(Screen theatre)
	{
		System.out.println("the movie process started");
		boolean isMovie=false;
		if(theatre.getTheatreName()!=null)
		{
			this.screen[index++]=theatre;
			isMovie=true;
		}	
		System.out.println("movies process ended...");
		return isMovie;
	}
	public void getScreen()
	{
		for(int index=0;index<this.screen.length;index++)
		{
			System.out.println(screen[index].getTheatreId()+ " " +screen[index].getTheatreName() + " " +screen[index].getAddress() + " " +screen[index].getScreenNo());
		}
	}
	public  Screen getTheatreByTheatreId(int theatreId)
	{
		System.out.println("Inside getTheatreByTheatreId method");
		for(int ind=0;ind<screen.length;ind++)
		{
			if(screen[ind].getTheatreId()== theatreId)
			{
				System.out.println("Patient id is matching..proceed the data");
				System.out.println(screen[ind].getTheatreId()+ " "+screen[ind]
.getTheatreName()+ " " +screen[ind].getAddress()+ " " +screen[ind].getScreenNo());
				return screen[ind];
			}
			System.out.println("end of getTheatreByTheatreId method");
			
		}
		return null;
	
	
}
}
