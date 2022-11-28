class exption
{
 public static void main(String args[])
{
	int a=1,b=0;
	try
	{
		System.out.println(a/b);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Cannot Devide By Zero");
	}
}
}