package pack3;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Userexcepdemo extends Exception
{

	public Userexcepdemo(String string) 
	{
	super(string);
	}

	public static void main(String[] args)
	{
	String num;
	Scanner sc=new Scanner(System.in);
	while (true)
	{
		try {
			System.out.println("enter 10 digit alpha numeric :");
			num = sc.next();

			if (num.length() != 10) {
				throw new Userexcepdemo("number should be 10 digit");
			} else {
				System.out.println(num);
				break;
				}
		}

		catch (Userexcepdemo e) {

			e.printStackTrace();
		} 
	}

	}

}
