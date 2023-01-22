class Movie
{
	public static void main(String lak[])
	{
		System.out.println("main started");
		review("Super");
		System.out.println("main ended");
	}
	public static void review(String people)
	{
		System.out.println("invoking review");
		System.out.println(people);
		System.out.println("review ended");
	}
}
