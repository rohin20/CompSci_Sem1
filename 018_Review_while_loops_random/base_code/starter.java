import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int rando = rand.nextInt(1000);
		rando = rando+1;
		System.out.println(rando);
		while(true){
			System.out.println("Guess a number between 1-1000");
			int guess = sc.nextInt();
			if(guess==rando){
				System.out.println("u got it!!!!!");
				break;
			}
			if(guess>rando){
				System.out.println("u are too high");
			
			}
			if(guess<rando){
				System.out.println("u are too low");
			}
		}


	}		
	
}
