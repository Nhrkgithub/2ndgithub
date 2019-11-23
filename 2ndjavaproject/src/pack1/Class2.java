package pack1;

public class Class2 extends Class1
{

	public Class2()
	{
		super(100,200);
		System.out.println("iam class2 constructor");
		
	}

	public static void main(String[] args)
	{
		Class2 c2=new Class2();
		c2.add();
		c2.sub();
	}

}
