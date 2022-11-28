interface A
{
	public void add();
}

public class B implements A
{
		void Data()
		{
			int a=10,b=20;

		}

		void add()
		{
			System.out.println(a+b);


		}
}

public class last extends B
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.Data();
		b1.add();
	}
}