package pack3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExcepDemo
{

	public static void main(String[] args) 
	{
	
		int nr, dr, result=0;
		Scanner sc=new Scanner(System.in);
				
		
		while (true)
		{
			
			System.out.println("enter numerator value:");
			nr=sc.nextInt();
			System.out.println("enter denominator value :");
			dr=sc.nextInt();
			
			
			try {
				result = nr / dr;

				System.out.println(result);
				
				break;

			} 
			catch (Exception e) 
			{

				//e.printStackTrace();
				System.out.println(e);
				System.out.println("denominator should be greater than zero");
				
				} 
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			catch (NoSuchElementException e)
			{
				e.printStackTrace();
			}
			}
		}

	}

}}
