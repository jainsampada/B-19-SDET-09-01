package StringDemos;

public class StringBufferDemo {
public void acc()
{
	StringBuffer sb=new StringBuffer("Hello ");
	sb.append("how are u?");
	System.out.println(sb);
	sb.delete(2, 5);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	
	StringBuilder bld=new StringBuilder("Welcome");
	bld.append(" to btes");
	System.out.println(bld);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferDemo oo=new StringBufferDemo();
		oo.acc();
	}

}
