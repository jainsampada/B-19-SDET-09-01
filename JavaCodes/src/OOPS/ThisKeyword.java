package OOPS;

public class ThisKeyword {
int num=393;
public void acc(int num)
{
	
	System.out.println(this.num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword oo=new ThisKeyword();
		oo.acc(20);
		
	}

}
