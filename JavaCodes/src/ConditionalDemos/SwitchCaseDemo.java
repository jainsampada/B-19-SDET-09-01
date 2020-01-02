package ConditionalDemos;
import java.util.Scanner;

public class SwitchCaseDemo {
int num1,num2,res,choice;
Scanner sc;
public void chooseChoice()
{
	System.out.println("1.Add\t\t2.Subtract\n3.Multiply\t4.Divide");
	System.out.println("Enter your Choice");
	sc=new Scanner(System.in);
	choice=sc.nextInt();
	
	System.out.println("Enter first Number");
	num1=sc.nextInt();
	
	System.out.println("Enter value for NUm2");
	num2=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		res=num1+num2;
		System.out.println("Result of Addition is:"+res);
	break;
	
	case 2: 
		res=num1-num2;
		System.out.println("Result of Subtraction is:"+res);
		break;
		
	case 3:
		res=num1*num2;
		System.out.println("Result of Multilication is:"+res);
		break;
		
	case 4:
		res=num1/num2;
		System.out.println("Result of Division is:"+res);
		break;
		
		default:
			System.out.println("You have entered  wrong choice");
			break;
		
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCaseDemo oo=new SwitchCaseDemo();
		oo.chooseChoice();
	}

}
