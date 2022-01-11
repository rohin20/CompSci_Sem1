import pkg.*;
import java.util.Scanner;
import java.util.Random;

 class Cat{
	String name;

	public Cat() {
		name = "Garfield";
		
	}
	public Cat(String a) {
		name = a;
		
	}
	
	public void meow(){
		System.out.println(name+" said meow");
	}
}


class starter {

	public static void main(String args[]) {
		// Your code goes below here
	Cat y = new Cat();
	y.meow();
	Cat x = new Cat("chicken");
	x.meow();
	

		

		
	}
}
