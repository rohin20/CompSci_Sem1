import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int number = rand.nextInt(1000);
		number = number+1;
		System.out.println(number);
		System.out.println("input a random number between 1 and 1000");
		int usrinp = sc.nextInt();
		if (usrinp==number){
			System.out.print("ur right");
		}
		else
		{
			System.out.print("ur wrong");
		}
	}
}
