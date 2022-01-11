import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What is ur role");
		MyCharacter test = new MyCharacter();
		boolean all = test.setAll("Wizard",1,1,1,1,1);
	}
}
