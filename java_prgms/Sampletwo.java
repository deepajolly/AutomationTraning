class Sampletwo
{
String name;
int age;
public int get(int age)
{
System.out.println(" age is "+age);
return age;
}
public Sampletwo(String n)
{
name=n;
System.out.println("name is "+name);
}
public static void main(String args[])
{
Sampletwo ob=new Sampletwo("deepa");
int age=ob.get(24);
}
}
