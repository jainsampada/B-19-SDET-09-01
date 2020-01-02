package LoopDemo;

import java.util.Scanner;

public class PrintTable {
	int num,count=1,res;
Scanner s=new Scanner(System.in);
public void print()
{
	System.out.println("Enter any No for which you want to print table");
	num=s.nextInt();
	while(count<=10)
	{
		res =num*count;
		System.out.println(num+"*"+count+"="+res);
		count++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable oo=new PrintTable();
		oo.print();
	}

}
