import java.util.Scanner;
class coba
{
	int a,b;
 public void input()
 {
  System.out.println("Enter a and b");
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("Numbers="+a+" "+b);
  System.out.println("Addition is="+(a+b));
}
}

class cob{
 public static void main(String args[])
 {
	coba c=new coba();
	c.input();
 System.out.println("Hello");
 }

}