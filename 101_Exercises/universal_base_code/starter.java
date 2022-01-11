import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Ascii as = new Ascii("Dog");
		Ascii x = new Ascii("Box","Joe");
		Ascii y = new Ascii("Cactus",3);
		Ascii z = new Ascii();
		z.setType("Human");
		z.setName("Henry");
		z.setNumber(3);
		as.printArt();
		x.printArt();
		y.printArt();
		z.printArt();
	

		
	}
}
