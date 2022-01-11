import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int numone = sc.nextInt();
		System.out.println("input a number");
		int numtwo = sc.nextInt();
		int num1 = numone%2;
		int num2 = numtwo%2;
		if(num1==0){
			System.out.println("Number one is even");
		}
		else{
			System.out.println("Number one is odd");
		}
		if(numone%3!=0){
			System.out.println("Number one is not divisible by 3");
		}
		if(numone%4!=0){
			System.out.println("Number one is not divisible by 4");
		}
		if(numone%5!=0){
			System.out.println("Number one is not divisible by 5");
		}		
		
		if(num2==0){
			System.out.println("Number two is even");
		}
		else{
			System.out.println("Number two is odd");
		}
		if(numtwo%3!=0){
			System.out.println("Number two is not divisible by 3");
		}
		if(numtwo%4!=0){
			System.out.println("Number two is not divisible by 4");
		}
		if(numtwo%5!=0){
			System.out.println("Number two is not divisible by 5");
		}		
	}
}
