package ExceptionHandlingdemo;

import java.time.DateTimeException;
import java.util.Scanner;

public class ArithmeticDemo {
int num1,num2,res;
Scanner sc=new Scanner(System.in);
public void division()
{
	try
	{
	System.out.println("Enter value for Num1");
	num1=sc.nextInt();
	
	System.out.println("Enter value for num2");
	num2=sc.nextInt();
	
	res=num1/num2;
	System.out.println("Result is:"+res);
	}
//	catch(ArithmeticException e)
//	{
//		System.out.println("Enter anouther value for num2 except 0");
//		num2=sc.nextInt();
//		res=num1/num2;
//		System.out.println("Result is:"+res);
//	}
//	catch(NullPointerException e2)
//	{
//		System.out.println("Null pointer exception");
//	}
//	catch(ArrayIndexOutOfBoundsException e1)
//	{
//		System.out.println("error");
//	}
//	catch(Exception ee)
//	{
//		ee.printStackTrace();
//	}
	finally
	{

		sc.close();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticDemo oo=new ArithmeticDemo();
		oo.division();
	}

}
