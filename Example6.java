class Example6
{
	public static void main(String a[])
	{
		for(int row=1;row<=4;row++)
		{
			for(int col=1;col<=4;col++)
			{
				if(row==3  && col==3)
				{
					System.out.print("xworks"+" ");
				}
				else
				{
					System.out.print(col+" ");
				}
			}
			System.out.println(" ");
		}
	}
}


//1 2 3 4
//1 2 3 4
//1 2 xworks 4
//1 2 3 4