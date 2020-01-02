

package InheritanceDemo;
import java.io.*;
public final class FinalDemo {
final double pie;//Final keyword used with variable
double area,radius;
public FinalDemo()
{
	pie=3.14;
	radius=2.44;
}
public final void acc()
{
	area=pie*radius*radius;
	System.out.println("Area of Circle is:"+area);
}
public void acc1()
{
	System.out.println(pie);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo oo=new FinalDemo();
		oo.acc();
		oo.acc1();
	}

}
class Abs extends FinalDemo
{
	public void acc()
	{
		
	}
	public void acc1()
	{
		acc();
	}
}
