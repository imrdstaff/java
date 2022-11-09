import java.util.*;
class methodoverload
{
	public void add(int a, int b)
	{
		System.out.println("Addition is "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is "+(a+b+c));
	}
public static void main(String args[])
{
	methodoverload m1=new methodoverload();

	m1.add(10,10);
	m1.add(10,10,10);
}
}