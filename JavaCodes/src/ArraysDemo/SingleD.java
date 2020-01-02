package ArraysDemo;

import java.util.Scanner;

public class SingleD {
	// int[] rollno={1,2,3,4,5};

	int counter, i, size;
	int[] rollno;
	Scanner s = new Scanner(System.in);

	public void get() {
		// System.out.println(rollno[2]);//access array data
		System.out.println("Enter size of an array");
		size = s.nextInt();
		rollno = new int[size];
		System.out.println("Enter elements of an array");
		for (i = 0; i < rollno.length; i++) {
			rollno[i] = s.nextInt();
		}
		// for (counter = 0; counter < rollno.length; counter++) {
		// System.out.println(rollno[counter]);
		// }
		for (int roll : rollno) // Enhanced for loop
		{
			System.out.println(roll);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleD oo = new SingleD();
		oo.get();
	}

}
