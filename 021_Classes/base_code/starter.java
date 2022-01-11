import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int Strength = 3;
	int Dexterity = 4;
	int Intelligence = 2;
	int Constitution = 5;
	int Charisma = 4;
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character mycharacter = new Character();
		System.out.println(mycharacter.role);
		System.out.println("strength = "+mycharacter.Strength);
		System.out.println("dexterity = "+mycharacter.Dexterity);
		System.out.println("intelligence = "+mycharacter.Intelligence);
		System.out.println("constitution = "+mycharacter.Constitution);
		System.out.println("charisma = "+mycharacter.Charisma);
		



		
	}
}
