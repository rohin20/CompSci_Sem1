import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int x = 1;
		int c = a;
		while(x!=b){
			c = c*a;
			x=x+1;
		}
		return c;
		
	}
	public static void main(String args[]) {
		// Your code goes below here

	int ans = pow(2,5);
	System.out.println(ans);
		
	}
}
