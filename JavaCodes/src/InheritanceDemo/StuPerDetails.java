package InheritanceDemo;

import java.util.Scanner;

public class StuPerDetails {
int Rollno,contactno;
String name;
Scanner sc=new Scanner(System.in);
protected void accept()
{
	System.out.println("Enter Rollno");
	Rollno=sc.nextInt();
	
	System.out.println("Enter name");
	name=sc.nextLine();
	sc.nextLine();
	
	
	System.out.println("Enter Contact No");
	contactno=sc.nextInt();
}
public void disp()
{
	System.out.println("Rollno is:"+Rollno);
	System.out.println("Name is:"+name);
	System.out.println("Contact No is:"+contactno);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
