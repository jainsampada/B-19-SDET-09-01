package ExceptionHandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
int rollno,age;
String Name;
Scanner sc=new Scanner(System.in);
public void accept() throws InvalidAgeExcetion,InputMismatchException
{
	System.out.println("Enter Rollno");
	rollno=sc.nextInt();
	
	System.out.println("Enter name");
	Name=sc.nextLine();
	sc.nextLine();
	
	System.out.println("Enter age");
	age=sc.nextInt();
	if(age>=18)
	{
		throw new InvalidAgeExcetion();
	}
	throw new InputMismatchException();
}
	public static void main(String[] args) throws InvalidAgeExcetion {
		// TODO Auto-generated method stub
		ThrowDemo oo=new ThrowDemo();
		oo.accept();
	}

}
