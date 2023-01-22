class Library
{
	public static double bookName(String book)
	{
		System.out.println("invoking bookName()");
		if(book=="Happy Life")
		{
			System.out.println("the book available: ");
			return 180.00;
		}
		else
		{
			System.out.println("the book not available");
		}
		System.out.println("bookName method ended");
		return 0.0;
	}
	public static double bookName(String book,int quantity)
	{
		if(book=="Happy Life")
		{
			return 180.00 * quantity;
		}
		else
		{
			System.out.println("the book not available");
		}
		return 0.0;
	}
}