class Example9
{
	public static void main(String a[])
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==2 && col==3 || row==3 && col==2 || row==3 && col==4 || row==4 && col==3)
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


//# # # # #
//# #   # #
//#   #   #
//# #   # #
//# # # # #