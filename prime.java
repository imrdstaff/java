import java.util.Scanner;
class prime
{

 public static void main(String args[])
 {
	 int n,i=2,temp=0;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter num: ");
       n=sc.nextInt();
	 while(i<n)
	 {
		if(n%i==0)
		{
			temp=1;
		}
		i++;

	 }
	if(temp==1)
	{
		System.out.println("No is not prime");
	}
	else
	System.out.println("Prime");
 }
}
