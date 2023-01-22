class Airport
{
	Terminal terminal[]=new Terminal[1];
	int i;
	
	public Airport()
	{
		System.out.println("the Object is crerated");
	}
	public boolean  add(Terminal entry)
	{
		System.out.println("the add process started....");
		boolean isAdded=false;
		if(entry.terminalName!=null && entry.terminalName!="")	
		{
			this.terminal[i]=entry;
			i++;
			isAdded=true;
		}	
		System.out.println(" the add process ended.....");
		return isAdded;
	}
	public void getTermainal()
	{
		for(int i=0;i<this.terminal.length;i++)
		{
			System.out.println(terminal[i].terminalId+ " " +terminal[i].terminalName + " " +terminal[i].noOfGate);
		}
	}
}