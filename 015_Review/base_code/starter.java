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
			System.exit(0);
		}
		
		System.out.println("you have 25 skill points to spend in strength,dexterity,intelligence,constitution,charisma. You can only spend 10 points on each");
		int points = 25;
		System.out.println("Strength(0-10)");
		int stre = sc.nextInt();
		if(stre>10){
			System.out.println("u put too many points >::::(((((((");
			stre = 10;
		}
		points = points-stre;
		if(points<0){
			System.out.println("You used too many points!!!!!");
			System.exit(0);
		}
		if(points==0){
			System.out.println("Strength - "+stre);
		}
		System.out.println("points = "+points);
		
		System.out.println("Dexterity(0-10)");
		int dex = sc.nextInt();
		if(dex>10){
			System.out.println("u put too many points >::::(((((((");
			dex = 10;
		}
		points = points-dex;
		if(points<0){
			System.out.println("You used too many points!!!!!");
			System.exit(0);
		}
		if(points==0){
			System.out.println("Strength - "+stre);
			System.out.println("Dexterity - "+dex);
			System.exit(0);
		}
		System.out.println("points = "+points);
		System.out.println("Intelligence(0-10)");
		int intel = sc.nextInt();
		points = points-intel;
		if(stre>10){
			System.out.println("u put too many points >::::(((((((");
			stre = 10;
		}
		if(points<0){
			System.out.println("You used too many points!!!!!");
			System.exit(0);
		}
		if(points==0){
			System.out.println("Strength - "+stre);
			System.out.println("Dexterity - "+dex);
			System.out.println("Intelligence - "+intel);
			System.exit(0);
		}
		System.out.println("points = "+points);
		System.out.println("Constitution(0-10)");
		int cons = sc.nextInt();
		points = points-cons;
		if(points<0){
			System.out.println("You used too many points!!!!!");
			System.exit(0);
		}
		if(points==0){
			System.out.println("Strength - "+stre);
			System.out.println("Dexterity - "+dex);
			System.out.println("Intelligence - "+intel);
			System.out.println("Constitution - "+cons);
			System.exit(0);
		}
		System.out.println("points = "+points);
		System.out.println("Charisma(0-10)");
		int charis = sc.nextInt();
		points = points-charis;

		System.out.println("points = "+points);
		if(points<0){
			System.out.println("You used too many points!!!!!");
			System.exit(0);
			
		}
		if(points==0){
			System.out.println("Strength - "+stre);
			System.out.println("Dexterity - "+dex);
			System.out.println("Intelligence - "+intel);
			System.out.println("Constitution - "+cons);
			System.out.println("Charisma - "+charis);;
			System.exit(0);
			
		}
		System.out.println("Strength - "+stre);
		System.out.println("Dexterity - "+dex);
		System.out.println("Intelligence - "+intel);
		System.out.println("Constitution - "+cons);
		System.out.println("Charisma - "+charis);
	}
}
