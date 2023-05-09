class Example8
{
	public static void main(String a[])
	{
		for(int row=1;row<5;row++)
		{
			for(int col=1;col<5;col++)
			{
				if(row==2 && col==2 || row==2 && col==3)
				{
				System.out.print(" "+" ");
				}
			
			else if( row==3 && col ==2 || row==3 && col==3)
			{
				System.out.print(" "+" ");
			}
			
			else{
				System.out.print("#"+" ");
			}
		}
		System.out.println(" ");
	}
}
}

//# # # #
//#     #
//#     #
//# # # #