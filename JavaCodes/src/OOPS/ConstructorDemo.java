package OOPS;

public class ConstructorDemo {
	public int rollno;
	public String name;

	public ConstructorDemo()// Default Constructor
	{
		rollno = 1;
		name = "Ishita";
		
	}
	public ConstructorDemo(String name)
	{
		System.out.println(name);
	}
	public ConstructorDemo(int num)// Parameterized Constructor
	{
		//this();
		this("Pooja");
		System.out.println(num);
	}

	public void display() {
		System.out.println("Rollno is:" + rollno);
		System.out.println("Name is:" + name);
	}

	public void display(int num1, int num2)// Method Overloading
	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConstructorDemo oo=new ConstructorDemo();
		ConstructorDemo obj = new ConstructorDemo(10);
		obj.display();
	}

}
