package ConditionalDemos;

import java.util.Scanner;

public class forLoop {
	int num;
	char choice;
	Scanner sc=new Scanner(System.in);
public void acc()
{
	do
	{
	System.out.println("Enter any no for which you want to print table");
	num=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(num+"*"+i+"="+num*i);
	}
	System.out.println("Enter ur choice");
	choice=sc.next().charAt(0);
	}
	while(choice=='y');
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forLoop oo=new forLoop();
		oo.acc();
	}

}
