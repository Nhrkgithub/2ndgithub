package pack1;

public class Class1 
{
int a,b,result;
	
	public Class1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		result=a+b;
		System.out.println("Addition of A & B is: " + result);
	}
public void sub()
{
	result=a-b;
	System.out.println("sub of A & B is: " + result);
}

	public static void main(String[] args) 
	{
		Class1 c1=new Class1(10,20);
		c1.add();
		c1.sub();
		
		
	}
}
