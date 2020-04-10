class ReturnExp
{
public static float add()
{
float a=0.1f;
float b=0.2f;
float c=a+b;
return c;
}
public static int subb()
{
	int e=20;
	int f=10;
	int g=e-f;
	return g;
}
public static int mul()
{
	int i=2;
	int j=3;
	int k=i*j;
	return k;
}
public static int div()
{
	int m=10;
	int n=2;
	int o=m/n;
	return o;
}

public static void main(String args[])
{
float c=ReturnExp.add();
System.out.println(" sum is "+c);
int g=ReturnExp.subb();
System.out.println(" difference is "+g);
int k=ReturnExp.mul();
System.out.println(" multipication is "+k);
int o=ReturnExp.div();
System.out.println(" division is "+o);
}
}
