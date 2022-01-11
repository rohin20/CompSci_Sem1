package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	
	public MyCharacter(){
		String role;
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

}

