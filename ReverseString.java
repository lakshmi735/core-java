class ReverseString 
{
	public static void main(String a[])
	{
		String name="Class Room";
		
		int count=0;
		char ch[]=name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			count+=1;
		System.out.println(ch[i]);
		}
		System.out.println("word count:"+count);
	}
}