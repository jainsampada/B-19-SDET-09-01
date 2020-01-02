package InheritanceDemo;

import java.util.Scanner;

import OOPS.ConstructorDemo;

public class StuMarksDet extends ConstructorDemo{
	int hindi,maths;
	Scanner sc=new Scanner(System.in);
public 	 void  accept()
	{
	
//		super.accept();
//		super.Rollno=111;
//		name="pooja";
	
		System.out.println("Enter marks in Hindi");
		hindi=sc.nextInt();
		
		System.out.println("Enter Marks in Maths");
		maths=sc.nextInt();
		//System.out.println(Rollno);
	}
public StuMarksDet()
{
	//super();//This will call default constructor of base class
	super(202);
	hindi=33;
	System.out.println(super.name);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuMarksDet oo=new StuMarksDet();
		oo.accept();
	}

}
