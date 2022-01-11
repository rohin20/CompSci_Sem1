import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		boolean yeah = true;
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		while(yeah){
			System.out.println("--------------------------------------------------");
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			String inp = sc.nextLine();
			if(inp.equals("yes")||inp.equals("Yes")||inp.equals("Y")||inp.equals("y")){
				System.out.println("you have $"+money+". how much would u like to wager?");
				int wager = sc.nextInt();
				sc.nextLine();
				while(wager>money){
					System.out.println("stop cheating");
					System.out.println("you have $"+money+". how much would u like to wager?");
					wager = sc.nextInt();
					sc.nextLine();
				}
				money = money-wager;
				System.out.println("Great! Let's play!!!");
				int rand1 = rand.nextInt(10);
				int rand2 = rand.nextInt(10);
				int rand3 = rand.nextInt(10);
				System.out.println("your rolls are:");
				System.out.println("____________________");
				System.out.println(rand1+"|"+rand2+"|"+rand3+"|");
				if(rand1==rand2){
					money = money+wager*2;
					System.out.println("you won! your wager has been doubled, you now have $"+money);
				}
				else if(rand1==rand3){
					money = money+wager*2;
					System.out.println("you won! your wager has been doubled, you now have $"+money);
				}
				else if(rand2==rand3){
					money = money+wager*2;
					System.out.println("you won! your wager has been doubled, you now have $"+money);
				}
				else{
					System.out.println("you lost! you now have $"+money);
				
				}
				}
			if(money<=0){
				System.out.println("your out of money! better luck next time !");
				break;
			}
		}
	}
}


