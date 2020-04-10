class Palindrome1
{
public static void main(String args[])
{
String n="MALAYALAM";
String temp=n;
String rev=0;
String rem;
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