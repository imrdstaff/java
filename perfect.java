import java.util.*;
class perfect
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 long n,sum=0;
	 System.out.print("Enter Num: ");
	 n=sc.nextLong();
	 int i=1;
	 while(i<=n/2)
	 {
		 if(n%i==0)
		 {
			 sum=sum+i;
		 }
		 i++;
	 }

	if(sum==n)
	{
		System.out.println("Number is perfect..");
	}

	else
	{
		System.out.println("Number is not perfect..");
	}

 }
}


