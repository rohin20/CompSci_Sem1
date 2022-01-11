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
	public String setRole(String a){
				if(a.equals("Wizard")){
			System.out.println("ur a Wizard");
			role = new String ("wizard");
		}
		else if(a.equals("Warrior")){
			System.out.println("ur a Warrior");
			role = new String ("warrior");
		}
		else if(a.equals("Rogue")){
			System.out.println("ur a rogue");
			role = new String ("Rogue");
		}
		else
		{
			System.out.println("u didnt spell it right");
			role = new String ("No Role");
		}
		return role;
	}

	public int setStrength(int a){
		strength = a;
		return strength;
	}
	public int setDexterity(int a){
		dexterity = a;
		return dexterity;
	}
	public int setIntel(int a){
		intelligence = a;
		return intelligence;
	}
	public int setConst(int a){
		constitution = a;
		return constitution;
	}
	public int setCharis(int a){
		charisma = a;
		return charisma;
	}
	public boolean setAll(String a, int b, int c, int d, int e, int f){
		if(a.equals("Wizard")){
			System.out.println("ur a Wizard");
			role = new String ("wizard");
		}
		else if(a.equals("Warrior")){
			System.out.println("ur a Warrior");
			role = new String ("warrior");
		}
		else if(a.equals("Rogue")){
			System.out.println("ur a rogue");
			role = new String ("Rogue");
		}
		else
		{
			System.out.println("u didnt spell it right");
			role = new String ("No Role");
		}
		strength = b;
		System.out.println("your strength is "+strength);
		dexterity = c;
		System.out.println("your dexterity is "+dexterity);
		intelligence = d;
		System.out.println("your intelligence is "+intelligence);
		constitution = e;
		System.out.println("your constitution is "+constitution);
		charisma = f;
		System.out.println("your charisma is "+charisma);
		return true;
	}
}

