class CountString    //count number of character
{
	public static void main(String a[])
	{
		String name="class  room"; //space is also count
		System.out.println(name);
		
		//character count by using length()
		System.out.println("String count is:"+name.length());
		
		//character count by using length and toCharArray()
		int count=0;
		char ch[]=name.toCharArray();    //toCharArray is used to convert String to char
		for(int i=0;i<ch.length;i++)    //here length is keyword not method
		{
			count++;
			//count=count+1; or count+=1;
		}
		System.out.println("word count is:"+count);
		
		int count1=0;    //find the string without using inbuilt method(length)
		for(char c:name.toCharArray())
		{
			System.out.println(c);
			count++;
		}
		System.out.println("count with for:"+count1);
			
		
	}
}

