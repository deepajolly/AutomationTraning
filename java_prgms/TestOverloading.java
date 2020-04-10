class TestOverloading
{
static int c;
public static int add(int a,int b)
{
c=a+b;
return c;
}
public static float add(float d)
{
float f=c+d;
return f;
}
public static void main(String args[])
{
int c=TestOverloading.add(10,20);
float f=TestOverloading.add(0.1f);
System.out.println(" sum is c: "+c);
System.out.println(" sum is f: "+f);
}
}