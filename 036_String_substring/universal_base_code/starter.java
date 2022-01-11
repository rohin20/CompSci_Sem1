import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("type");
		String inp = sc.nextLine();
		int c = 0;

		while(c<inp.length()){
			System.out.println(inp.substring(c,c+1));
			c = c+1;
		}

		
	}
}
