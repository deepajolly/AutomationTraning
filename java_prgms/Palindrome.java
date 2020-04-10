class Palindrome
{
public static void main(String args[])
{
int n=234;
int temp=n;
int rev=0;
int rem;
while(n!=0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(temp==rev)
{
System.out.print("palindrome");
}
else
{
System.out.print("not palindrome");
}
}
}