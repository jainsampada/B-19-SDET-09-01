package InheritanceDemo;

public class Deer extends AnimalDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer oo=new Deer();
		oo.eat();
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("DEER eats Veg Food");
		drink();
		a=100;
		System.out.println(a);
	}

}
