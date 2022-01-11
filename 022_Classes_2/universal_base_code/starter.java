import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		

		myCharacter mycharacter = new myCharacter();
		System.out.println(mycharacter.role);
		System.out.println("strength = "+mycharacter.Strength);
		System.out.println("dexterity = "+mycharacter.Dexterity);
		System.out.println("intelligence = "+mycharacter.Intelligence);
		System.out.println("constitution = "+mycharacter.Constitution);
		System.out.println("charisma = "+mycharacter.Charisma);
		
	}
}
