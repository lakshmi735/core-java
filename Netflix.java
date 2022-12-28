class Netflix
{
static String englishWebSeries[]={"Love o2o","Sweet Revenge","Put your Head On My Shoulder","xyz","abc"};
public static void main(String l[])
{
	getEnglishWebSeries();
}
public static void getEnglishWebSeries()
{
	System.out.println(englishWebSeries.length);
	System.out.println("list of English series are....");
	for(int i=0;i<englishWebSeries.length;i++)
	{
		System.out.println(englishWebSeries[i]);
		//stem.out.println(i);
		//stem.out.println(englishWebSeries[i]);
	}
}

}