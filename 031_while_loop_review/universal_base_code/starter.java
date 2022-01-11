import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int x=0;
		while(x!=100){
			int y = rand.nextInt(100);
			System.out.println(y);
			x=x+1;
		}


		
	}
}
