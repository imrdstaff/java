
//INNER CLASS
class Outer
{
//inner class
 private class inner
  {
	  public void print()
		{
			System.out.println("This is inner class");
		}
  }
  //Accessing inner class
 void displayinner()
  {
	inner inner=new inner();
	inner.print();
  }
}

public class myclass
{
	public static void main(String args[])
	{
	Outer outer=new Outer();
	outer.displayinner();
	}
}
