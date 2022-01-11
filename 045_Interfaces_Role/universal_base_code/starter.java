import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Rogue a = new Rogue();
		Warrior b = new Warrior();
		Wizard c = new Wizard();
		
		Role[]x = new Role[3];
		x[0] = new Warrior();
		x[1] = new Wizard();
		x[2] = new Rogue();
		
		String nam;
		nam = x[0].getName();
		x[0].printArt();
		System.out.println(nam);
		nam = x[1].getName();
		x[1].printArt();
		System.out.println(nam);
		nam = x[2].getName();
		x[1].printArt();
		System.out.println(nam);
		

		
	}
}
