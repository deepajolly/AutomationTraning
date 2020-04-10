class StringBuilder
{
	String name;
	public StringBuilder(String n);
	{
		name=n;
		System.out.println(name);
	}
public static void main(String args[])
{
StringBuilder sb=new StringBuilder("Hello");
sb.reverse();
System.out.println(sb);
}
}