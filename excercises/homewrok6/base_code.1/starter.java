import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int a){
		int num1 = a;
		int counter = num1-1;
		boolean flag = true;
		while(counter!=1){
			if((num1%counter)==0){
				flag = false;
				break;
			}
			counter = counter-1;	
		}
		return flag;
	}

	public static void printPrimes(int a){
		int num1 = a;
		int counter = num1;
		while(counter!=1){
			boolean prime = checkPrime(counter);
			if(prime){
				System.out.println(counter);
			}
			counter = counter-1;
		}
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("put in number");
	int inp = sc.nextInt();
	printPrimes(inp);


		
	}
}
