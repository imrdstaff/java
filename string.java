class string
{
public static void main(String args[])
{
//create string
String First="Hello";
String Second="World";
String Thhird="Nmaste";

//join string
String join=First.concat(Second);
System.out.println(join);
//length string
int length=join.length();
System.out.println("Length="+length);
//compare string
boolean result=First.equals(Second);
System.out.println("Comparison="+result);

}
}