class Samp
{
String name;
public void get()
{
System.out.println("abc");
System.out.println(name);
}
public Samp(String n)
{
name=n;
System.out.println(n);
}
public static void main(String args[])
{
Samp ob=new Samp("deepa");
ob.get();
}
}