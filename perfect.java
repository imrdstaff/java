import java.util.Scanner;
class perfect
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i=1,num,sum=0;
	System.out.println("Enter No");
	num=sc.nextInt();

	while(i<num)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
		i++;

	}

	if(sum==num)
	{
	System.out.println("NO is perfect");
	}
	else
	{
	System.out.println("No is not perfect");
	}
}
}