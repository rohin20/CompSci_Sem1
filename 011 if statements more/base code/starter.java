import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.\
		System.out.println("input number one");
		int numone = sc.nextInt();
		System.out.println("input number two");
		int numtwo = sc.nextInt();
		if(numone!=numtwo){
			System.out.println("the variables are different");
		}
	}
}
