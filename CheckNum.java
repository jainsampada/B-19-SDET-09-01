public class CheckNum
{
	int num1=10;
	public void checkEven()
	{
		if(num1%2==0)	
		{
			System.out.println("This is even Num");
		}			
		else
		{
			System.out.println("This is odd num");
		}
	}
	public static void main(String[] a)
	{
		CheckNum oo=new CheckNum();
		oo.checkEven();
	}
	
}