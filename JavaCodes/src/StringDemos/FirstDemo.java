package StringDemos;

public class FirstDemo {
	String str = "Ritika kh",st;//Literal
	String str1 = new String("Pooja");//Heap Memory
	int a=100,b=230,count;
	char a1;
	public void check() 
	{
			System.out.println(str);
			System.out.println(str1);
			//System.out.println(a+b+str+str1);//operator overloading
			a1=str.charAt(1);
			System.out.println("character at index 1"+a1);
			st=str.concat(str1);
			System.out.println(st);
			count=st.length();
			System.out.println("Length of Count is:"+count);
			str.split("");
			System.out.println("-----"+str);
			if(st.contains("pr"))
			{
				System.out.println("it is contained in String St");
			}
			else
			{
				System.out.println("It is not contained");
			}
			System.out.println(st.replace("o", "i"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDemo oo=new FirstDemo();
		oo.check();
	}

}
