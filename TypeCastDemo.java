public class TypeCastDemo
{
	public static void main(String[] ar)
	{
		int a=100;
		short num;
		//num2=a;
		//Implicit Type cast
		//a=num2;
		
		//Explicit Type cast
		num=(short)a;
		System.out.println("num is:"+num);
		System.out.println("a is:"+a);
	}
}