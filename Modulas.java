class Modulas
{
public static void main(String lak[])
{
//mod(45,89);
//mod(56,23);
//mod(656,455);
//mod(123,789);
//mod(787,542);
//mod(5,6);
int modulas=mod(45,89);
System.out.println("the modulas of two number is: "+modulas);
int modulas1=mod(56,23);
System.out.println("the modulas of two number is: "+modulas1);
int modulas2=mod(656,455);
System.out.println("the modulas of two number is: "+modulas2);
int modulas5=mod(123,789);
System.out.println("the modulas of two number is: "+modulas5);
int modulas3=mod(787,542);
System.out.println("the modulas of two number is: "+modulas3);
int modulas4=mod(45,78,56);
System.out.println("the modulas of three number is: "+modulas4);


}
//public static void mod(int number1,int number2)
public static int mod(int number1,int number2)
{
System.out.println(number1%number2);
return number1%number2;
}
public static int mod(int number1,int number2,int number3)
{
	return number1%number2%number3;
}
}