public class GreatestDemo
{
	int num1=10,num2=20,num3=30;
	public void Check()
	{
		if((num1>num2)&&(num1>num3))
		{
			System.out.println("Num1 is greater"+num1);
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("Num2 is greater"+num2);
		}
		else
		{
			System.out.println("Num3 is greater"+num3);
		}
	}
	public static void main(String[] ar)
	{
		GreatestDemo obj=new GreatestDemo();
		obj.Check();
	}
}