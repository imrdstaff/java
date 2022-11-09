import java.io.*;
class zero
{
	public static void main(String args[])
	{
		int a=5;
		int b=0;

		try{
			System.out.println(a/b);//throw exception
		}

		catch (ArithmeticException e)
		{
			//Exception Handler
			System.out.println("Devide By zero operation cannot be possible");
		}
	}
}