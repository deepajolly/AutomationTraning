class Person 
{
 static String n;
 static int a;
 public static void setdata()
 {
	 n="Deepa jolly";
	 a=24;
 }
public static void getData()
{
System.out.println("My name is "+n);
System.out.println("My age is "+a);
}
public static void main(String args[])
{
	Person.setdata();
Person.getData();
}
}
