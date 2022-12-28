class Subtraction
{
public static void main(String lak[])
{
int subtraction=sub(564,243);
System.out.println("the subtraction of two number is: "+subtraction);
int subtraction1=sub(979,588);
System.out.println("the subtraction of two number is: "+subtraction1);
int subtraction2=sub(3256,2365);
System.out.println("the subtraction of two number is: "+subtraction2);
int subtraction3=sub(9855,2456);
System.out.println("the subtraction of two number is: "+subtraction3);
int subtraction4=sub(98,56,32);
System.out.println("the subtraction of three number is:"+subtraction4);
//sub(654,325);
//sub(656,354);
//sub(325,886);
}
public static int sub(int number1,int number2)
{
return number1-number2;
}
public static int sub(int number1,int number2,int number3)
{
	return  number1-number2-number3;
}
}