package InheritanceDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B oo=new B();
		oo.acc(10);
		oo.acc(10.0);
		
	}

}
class A
{
	public void acc(double num)
	{
		System.out.println(num*2);
	}
}
class B extends A
{
	public void acc(double num)
	{
		System.out.println(num);
	}
}
