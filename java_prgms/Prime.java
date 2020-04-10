class Prime 
{
public static void main(String args[])
{
int i;
int m=0;
int flag=0;
int n=3;
m=n/2;
if(n==0||n==1)
{
	System.out.print("is not prime"+n);
}
else
{	
for(i=2;i<=m;i++)
{
	if(n%i==0)
	{
		System.out.print("is not a prime number "+n);
		flag=1;
		break;
	}
}
}
if(flag==0)
{
	System.out.print(" prime number "+n);
}
}
}

	

	