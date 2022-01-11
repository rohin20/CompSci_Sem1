package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	String role;
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	public MyCharacter(){
		
		role = new String("No Role");
	}

	public MyCharacter(String role) {
		if(role.equals("Wizard")){
			System.out.println("ur a Wizard");
			role = new String ("wizard");
		}
		else if(role.equals("Warrior")){
			System.out.println("ur a Warrior");
			role = new String ("warrior");
		}
		else if(role.equals("Rogue")){
			System.out.println("ur a rogue");
			role = new String ("Rogue");
		}
		else
		{
			System.out.println("u didnt spell it right");
			role = new String ("No Role");
		}
		

	}
		public void myToString() {
			System.out.println("your role is "+role);
			System.out.println("your strength is "+strength);
			System.out.println("your dexterity is " + dexterity);
			System.out.println("your intelligence is "+intelligence);
			System.out.println("your constitution is"+constitution);
			System.out.println("your charisma is"+charisma);		
		}
}
