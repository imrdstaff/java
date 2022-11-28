import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
 Scanner sc= new Scanner(System.in);
 int n,sum=0,rem,temp;
 System.out.println("Enter num: ");
 n=sc.nextInt();

 temp=n;

 while(n>0)
 {
	 rem=n%10;
	 sum=sum+(rem*rem*rem);
	 n=n/10;
 }

if(temp==sum) {System.out.println("Number is Armstrong");}
else
System.out.println("Not Armstrong");
}
}