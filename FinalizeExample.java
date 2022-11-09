class FinalizeExample
{
 public static void main(String args[])
 {
	 FinalizeExample obj = new FinalizeExample();
	 obj=null;
 }

 @Override
 protected void finalize()
 {
	 System.out.println("Finalize Method called");
 }
}