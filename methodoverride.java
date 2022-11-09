class parent
{
	void show()
	{
		System.out.println("Parent's show()");
	}

}

class child extends parent
{
	@Override
	void show()
	{
		System.out.println("child's show()");
	}
}

class overriding
{

public static void main(String args[])
{
 parent obj = new parent();
  obj.show();
}
}