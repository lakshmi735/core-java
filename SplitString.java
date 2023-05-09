class SplitString //declare string ......  count the no of words
{
	public static void main(String a[])
	{
		String city="Hello.... Welcome to bangalore";
		System.out.println(city);
		//split method
		//String c[]=city.split(" "); // space is deliminatoe
		String c[]=city.split("a");
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
			count++;
		}
		System.out.println("word count:"+count);
	}
}