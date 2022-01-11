package pkg;
import java.util.Scanner;
import java.util.Random;

public class Cat{
	String name;

	public Cat() {
		name = "Garfield";
		
	}
	public Cat(String a) {
		name = a;
		
	}
	
	public static void meow(){
		System.out.print(name+"said meow");
	}
}

