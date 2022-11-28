interface A
{
	public void printable();
}

class B implements A
{
	public void printable()
	{
		System.out.println("INTERFACE METHOD");

	}

	public static void main(String args[])
	{
		B b=new B();
		b.printable();
	}
}