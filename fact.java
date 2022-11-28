import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int facto=1,no;
		System.out.println("Enter No");
		no=sc.nextInt();
	    int i;
		for(i=1;i<=no;i++)
		{
			facto=facto*i;
		}

		System.out.println("Factorial is "+facto);
	}
}