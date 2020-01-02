
public class MethodsDemo {
	int sum;
public int add(int num1,int num2)//Taking something returning something
{
	return sum=num1+num2;
}
public void sub()
{
	System.out.println(add(102,33));//Calling of method
}
public void sum(int num1,int num2)//Taking Something returning nothing
{
	sum=num1+num2;
	System.out.println(sum);
}

public int acc()//Taking Nothing returning something
{
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo oo=new MethodsDemo();
		System.out.println(oo.add(10, 20));
		oo.sub();
		oo.sum(1223,44);
		System.out.println(oo.acc());
	}

}
