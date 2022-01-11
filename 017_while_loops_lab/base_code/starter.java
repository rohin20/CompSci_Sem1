import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("wahts ur name");
	String name = sc.nextLine();
	System.out.println("how much should i output ur name");
	int numb = sc.nextInt();
	int a = 1;
	while(true){
		System.out.println(name);
		if(a==numb){
			break;
		}
		a = a+1;
	}
	

		
	}
}
