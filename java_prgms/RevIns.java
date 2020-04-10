class RevIns
{
int num;
int rev=0;
int rem;
public RevIns()
{
this(123);
System.out.println("reverse number is: "+rev);
}
public RevIns(int num)
{
while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
}
public static void main(String args[])
{
RevIns ob1=new RevIns();
}
}