import java.util.Scanner;
class fibbonocci
{
  public static void main(String ags[])
  {
	  Scanner sc= new Scanner(System.in);
  int n1=0,n2=1,n3,num,i=0;
  System.out.println("Enter num=");
  num=sc.nextInt();
  System.out.println("------------------------------- Fibbonocci Series upto "+num+" Terms ----------------------");
  System.out.println(n1);
  System.out.println(n2);
   for(i=2;i<num;i++)
  {
	  n3=n1+n2;
	  n1=n2;
	  n2=n3;
	  System.out.println(n3);
  }

  }
}