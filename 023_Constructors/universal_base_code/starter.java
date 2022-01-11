import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		MyCharacter test = new MyCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("What is ur role");
		String a = sc.nextLine();
		MyCharacter test2 = new MyCharacter(a);
		
	}
}
