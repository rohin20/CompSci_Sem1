package pkg;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
	public String name;

	public Donkey() {
		name = "Donkey";
	}

	private String getName(){
		return name;
	}

	public void interact(){
		System.out.println(name + ", parfaits may be the most delicious thing on the whole planet!");
		System.out.println(name + ", what are you doing in my swamp?!");
		return;
	}



}
