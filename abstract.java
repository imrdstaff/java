abstract class X
{
	int i=10;
	public abstract void display(); //abstract method
}

class Y extends X
{
	int i=20;
	public void display()
	{
		System.out.println("Hello");
	}
}

class abstract
{
	public static void main(String args[])
	{
		Y d=new Y();
		d.display();
		System.out.println("d.i"+d.i);
		X a=new Y();
		a.display();
		System.out.prinln("a.i"+a.i);
	}
}