class Shop
{
       public static void main(String args[])
	   {
	     int a=1000;
	     int b=1000;
	     int c=1500;
	     int d=1000;
	     int e=1000;
	     int f=Shop.total(a,b,c,d,e);
	     int g=Shop.discount(f);
	   }
public static int total(int h,int i,int j,int k,int l)
   {
     int totalamount=h+i+j+k+l;
     System.out.println("total amount of purchase="+totalamount);
     return(totalamount);
   }
public static int discount(int m)
{
if(m>5000)
{
int n=m*20/100;
int amount=m-n;
System.out.println("total amount after discount="+amount);
return(amount);
}
else 
{
System.out.println("no discount amount="+m);
return(m);
}
}
}