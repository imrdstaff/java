interface printable
{
void print();
}

interface showable
{
	void show();
}

class test
{
	void hello()
	{
	System.out.println("test class");
}
}

class inter extends test implements printable, showable
{
	public void print()
	{
		System.out.println("Hello");
	}

	public void show()
	{
		System.out.println("Welcome");
	}

	public static void main(String args[])
	{
		inter obj=new inter();
		obj.print();
		obj.show();
		obj.hello();
		}
}
