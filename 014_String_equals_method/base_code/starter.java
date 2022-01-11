import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("do ya wanna be a Wizard, Warrior, or a Rogue");
		String inp = sc.nextLine();
		
		if(inp.equals("Wizard")){
			System.out.println("ur a Wizard");
		}
		else if(inp.equals("Warrior")){
			System.out.println("ur a Warrior");
		}
		else if(inp.equals("Rogue")){
			System.out.println("ur a rogue");
		}
		else
		{
			System.out.println("u didnt spell it right");
		}
	}
}
