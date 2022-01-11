import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Rogue a = new Rogue();
		Warrior b = new Warrior();
		Wizard c = new Wizard();
		String name;
		name = a.getName();
		System.out.println(name);
		name = b.getName();
		System.out.println(name);
		name = c.getName();
		System.out.println(name);		
		
	}
}
