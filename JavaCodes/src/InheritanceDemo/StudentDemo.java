package InheritanceDemo;

public class StudentDemo  implements IntMarksDet,IntPerdet  {
int rollno,ContactNo;
String name;
	@Override
	public void perdet() {
		// TODO Auto-generated method stub
		System.out.println("Enter Rollno");
		rollno=sc.nextInt();
		
		System.out.println("Enter name");
		name=sc.next();
		
		System.out.println("Enter Contact No");
		ContactNo=sc.nextInt();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rollno is:"+rollno);
		System.out.println("NAME IS:"+name);
		System.out.println("Contact No is:"+ContactNo);
	}

	@Override
	public void marksdet() {
		// TODO Auto-generated method stub
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo oo=new StudentDemo();
		
		oo.perdet();
		oo.display();
	}

	

}
