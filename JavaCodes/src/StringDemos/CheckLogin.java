package StringDemos;

import java.util.Scanner;

public class CheckLogin {
String uname,pass;
Scanner sc=new Scanner(System.in);
public void check()
{
	System.out.println("Enter username");
	uname=sc.next();
	
	System.out.println("Enter Password");
	pass=sc.next();
	
	if(uname.equalsIgnoreCase("admin") && pass.equals("admin"))
	{
		System.out.println("You are valid user");
	}
	else
	{
		System.out.println("you are not a valid user");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckLogin oo=new CheckLogin();
		oo.check();
	}

}
