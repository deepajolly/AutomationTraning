class PalindromeStatic
{
   static int temp;
   static int rev=0;
   static int rem;
public static void reverse(int n)
{
	temp=n;
  while(n!=0)
  {
	  rem=(n%10);
   rev=(rev*10)+rem;
   n=n/10;
   
  }
}
public static void check()
{
if(temp==rev)
{
System.out.println(" Number is a palindrome");
}
else
{
System.out.println(" Number is not a palindrome");
}
}
public static void main(String args[])
{
PalindromeStatic.reverse(121);
PalindromeStatic.check();
}
}