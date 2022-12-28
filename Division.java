class Division
{
public static void main(String lak[])
{
int division=div(45,56);
System.out.println("the division od two number is: "+division);
int division1=div(23,12);
System.out.println("the division of two number is: "+division1);
int division2=div(656,523);
System.out.println("the division of two number is: "+division2);
int division3=div(545,354);
System.out.println("the division of two number is: "+division3);
int division4=div(887,321);
System.out.println("the division of two number is: "+division4);
int division5=div(54,69,89);
System.out.println("the division of three number is: "+division5);

}
public static int div(int number1,int number2)
{
	return number1/number2;
}
public static int div(int number1,int number2,int number3)
{
	return number1/number2/number3;
}
}