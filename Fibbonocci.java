import java.util.Scanner;
class Fibbonocci
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number=");
	int num=sc.nextInt();
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=3;i<=num;i++)
	{
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;

	}
 }
}