class Addition
{
	public static void main(String lak[])
	{
		//initialtion or invoking a method/calling a method
		//arguments are 123,875
		int total=add(123,875);
		System.out.println("the addition of two number is: "+total);
		//invoking
		int total2=add(758,978);
		System.out.println("the addition of two number is: "+total2);
		//invoking
		int total3=add(432,545);
		System.out.println("the addition of two number is: "+total3);
		int total4=add(655,435);
		System.out.println("the addition of two number is: "+total4);
		int total5=add(45,89,23);
		System.out.println("the addition of three number is:"+total5);
		//add(547,764);
		//add(756,875);
		//add(786,432);
	}
	//declation of a add method
	public static int add(int number1,int number2)
	{
		System.out.println(number1+number2);
		return number1+number2; 
	}
	public static int add(int number1,int number2,int number3)
	{
		System.out.println(number1+number2+number3);
		return number1+number2+number3;
	}
}