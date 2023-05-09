class Example7
{
	public static void main(String a[])
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if(row==1 && col==1|| row==1 && col==2 || row==1 && col==4 || row==1 && col==5)
				{
					System.out.print(" "+" ");
				}
				else if(row==2 && col==1|| row==2 && col==2 || row==2 && col==4 || row==2 && col==5)
				{
					System.out.print(" "+" ");
				}
				
				
				else if(row==4 && col==1|| row==4 && col==2 || row==4 && col==4 || row==4 && col==5)
				{
					System.out.print(" "+" ");
				}
				else if(row==5 && col==1|| row==5 && col==2 || row==5 && col==4 || row==5 && col==5)
				{
					System.out.print(" "+" ");
				}
			
			else
			{
				System.out.print( "#"+" ");
			}
		}
		System.out.println(" ");
	}
}
}
//if(row==1 && col==1|| row==1 && col==2 || row==1 && col==4 || row==1 && col==5 || row==2 && col==1|| row==2 && col==2 || row==2 && col==4 || row==2 && col==5 ||row==4 && col==1|| row==4 && col==2 || row==4 && col==4 || row==4 && col==5 || row==5 && col==1|| row==5 && col==2 || row==5 && col==4 || row==5 && col==5)
//{
	//System.out.print(" "+" ");
				//}
				//else{
					//System.out.print("#"+" ");
				//}
			//}
			//System.out.println(" ");
		//}
//}
//     #
//     #
// # # # # #
//     #
//     #