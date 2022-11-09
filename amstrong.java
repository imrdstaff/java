import java.util.Scanner;
class amstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int n,r,sum=0,temp;
	System.out.println("Enter num=");
	n=sc.nextInt();
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}

	if(temp==sum)
	{
		System.out.println("Given Number is Amstrong");
	}
	else
	{
		System.out.println("Given Number is not Amstrong");
	}
}
}