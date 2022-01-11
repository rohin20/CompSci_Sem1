import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int numberone = rand.nextInt(10);
		System.out.println(numberone);
		int numbertwo = rand.nextInt(100);
		numbertwo = numbertwo+1;
		System.out.println(numbertwo);
		double randm = rand.nextDouble();
		randm = randm+2.5;
		System.out.println(randm);
		double big = rand.nextDouble();
		int numberthree = rand.nextInt(589);
		numberthree = numberthree + 14;
		double ans = numberthree + big;
		System.out.println(ans);
	}
}
