package InheritanceDemo;


class Base{
		String s = "Base";
		String show() 
		{
		return s;  
		} 
	}      
class Derived extends Base
{
	String s = "Derived";
}   
public class Test1 { 
		       
	void print(Base b)
	{  
		          System.out.println(b.show());
	}   
	void print(Derived d){
		          
		System.out.println(d.show());
		       }  
	public static void main(String[] args){
		Test1 t = new Test1();
		Base b = new Derived();
		t.print(b);       
		}
	}

