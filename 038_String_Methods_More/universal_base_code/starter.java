import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("whats ur name");
		String inp = sc.nextLine();
		int len = inp.length();
		System.out.println(len);
		int num = inp.indexOf(" ");
		System.out.println(num);
		String hi = inp.substring(num,len);
		System.out.println(hi);
	}
}
