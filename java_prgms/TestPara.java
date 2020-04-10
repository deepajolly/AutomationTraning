class TestPara
{
public TestPara()
{
System.out.println("am in default construction");
}
public TestPara(int a)
{
System.out.println(a);
}
public static void main(String args[])
{
TestPara ob1=new TestPara();
TestPara ob2=new TestPara(1);
ob1.hello(10);
}

public void hello(int a)
{
System.out.println("iam in instance method"+a);
}
}