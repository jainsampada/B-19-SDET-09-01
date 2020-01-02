package StringDemos;

import java.util.Scanner;

public class BadWordsDemo {
	Scanner s;
	String str;
	//String sd;
	int i;
	String[] arr = { "stupid", "foolish", "bastard", "rascal", "nonsense" };

	public void encrypt() {
		s = new Scanner(System.in);

		System.out.println("Enter the string");
		str = s.nextLine();

		for (i = 0; i < arr.length; i++) {

			//sd = arr[i].toString();

			//if (str.contains(arr[i])) {
				str = str.replaceAll(arr[i], "*****");

				// break;
			}

		//}
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BadWordsDemo opo = new BadWordsDemo();
		opo.encrypt();
	}

}
