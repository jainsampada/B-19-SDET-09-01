package StringDemos;

public class StringSplit {
	String str="Ritika#Khurana";
	String st;
	String[] arr;
public void acc()
{
//	arr=str.split(" ");
//	System.out.println(arr[0]);
	st=str.substring(2,5);
	System.out.println(st);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSplit oo=new StringSplit();
		oo.acc();
	}

}
