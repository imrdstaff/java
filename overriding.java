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
		//remove it from comment when parent method need to call.
		//super.show();

		System.out.println("child's show()");
	}
}

class overriding
{

public static void main(String args[])
{
 child obj = new child();
  obj.show();
}
}