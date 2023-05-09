class Example11   //find the string without using inbuilt method(length)
{
public static void main(String a[])
{
String name="city";
int count=0;
char ch[]=name.toCharArray();
for(char c:ch)
{
System.out.println(c);
//count++;
}
System.out.println("count with for:"+count);
}
} 