package OOPS;

public class InstanceVariable {
		//int num1;
	static int num1;
	int num2=100;
public static void acc()
{
		num1++;
		//System.out.println(num2);
		disp();
}
public static void disp()
{
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable.acc();
		InstanceVariable oo=new InstanceVariable();
		oo.num1=100;
		oo.num1++;
		System.out.println(oo.num1);
		
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.num1);
		
		InstanceVariable ob=new InstanceVariable();
		System.out.println(ob.num1);
		
//		InstanceVariable oo=new InstanceVariable();
//		
//		System.out.println(oo.num1);
//		num1++;
//		InstanceVariable obj=new InstanceVariable();
//		System.out.println(obj.num1);
	}

}
