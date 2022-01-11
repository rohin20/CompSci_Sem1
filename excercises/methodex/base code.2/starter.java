import java.util.Scanner;
import java.util.Random;

class starter {
	public static void Rohin(int a, int b){
		int after = a*b;
		int check = after%3;
		if(check==0){
			System.out.println(after);
		}
		
	}
	public static void main(String args[]) {
		Rohin(5,8);
		
	}
}


