class RevThis
{
int g;
public RevThis()
{
this(123);
System.out.println("Reverse of a number is "+g);
}
public RevThis(int n)
{
int rev=0;
while(n!=0)
{
int rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
g=rev;
}
public static void main(String args[])
{
RevThis ob=new RevThis();
}
}